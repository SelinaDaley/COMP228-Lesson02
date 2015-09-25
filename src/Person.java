
public class Person {
	private String _gender;
	private String _name;
	private int _age;
	
	/*public int getAge() {
		return this._age;
	}

	public void setAge(int age) {
		this._age = age;
	}*/

	public String getGender() {
		return this._gender;
	}

	public void setGender(String gender) {
		this._gender = gender;
	}

	public String getName() {
		return this._name;
	}

	public void setName(String name) {
		this._name = name;
	}
	
	
	//constructor
	public Person(int age)
	{
		this._age = age;
	}
	
	//public method
	public void runs()
	{
		System.out.printf("%s Runs", this._name);
	
	}
}
