package spring.learn.test;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Carlose wei
 * @version 1.0
 * @date 2020/4/9 16:32
 */
public class parent_sun {
	private final Resource XML =
			new ClassPathResource("parent_sun.xml", this.getClass());

	/**
	 * 父子bean测试
	 */
	@Test
	public void test1() {
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		new XmlBeanDefinitionReader(bf).loadBeanDefinitions(XML);
		SunBean sunBean = bf.getBean("sunBean", SunBean.class);
		System.out.println(sunBean.toString());
	}
}
