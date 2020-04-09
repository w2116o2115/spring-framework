package spring.learn.test;

/**
 * @author Carlose wei
 * @version 1.0
 * @date 2020/4/9 16:28
 */
public class ParentBean {
	/** 姓名 **/
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ParentBean{" + "name='" + name + '\'' + '}';
	}
}
