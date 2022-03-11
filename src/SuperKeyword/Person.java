package SuperKeyword;

public class Person {
	int id;
	String name;

	public Person(int i, String n) 
	{
		id = i;
		name = n;
	}

	/*
	 * Alternate method by using "this" keyword public Person(int id, String name) {
	 * this.id=id; this.name=name; }
	 */
	// method
	public void personmethod() 
	{
		System.out.println("Person class method is created");
	}

}
