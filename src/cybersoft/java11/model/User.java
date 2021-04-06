package cybersoft.java11.model;

public class User {
	private String name;
	private int age;
	private String username;
	private String password;

	/*---------CONTRUCTORS-----------*/
	public User() {
		this.name = "";
		this.age = 20;
		this.username = "";
		this.password = "";
	}

	public User(String name, int age, String username, String password) {
		this.name = name;
		this.age = age;
		this.username = username;
		this.password = password;
	}

	/*---------METHODS-----------*/
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
