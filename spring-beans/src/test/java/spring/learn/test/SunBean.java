package spring.learn.test;

/**
 * @author Carlose wei
 * @version 1.0
 * @date 2020/4/9 16:29
 */
public class SunBean {
	/** 姓名 **/
	private String name;
	/** 年龄 **/
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SunBean [name=" + name + ", age=" + age + "]";
	}
}
