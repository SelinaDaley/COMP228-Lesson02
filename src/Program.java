
public class Program {
	
	public static Person person;
	
	public static void main(String[] args) {		
		System.out.println("Program Started...");
		
		person = new Person(46);
		
		person.setGender("Male");
		person.setName("Tom");
		//person.setAge(7);
		
		person.runs();
		
		
		
	}

}
