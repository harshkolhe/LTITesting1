package SuperKeyword;

public class Employee extends Person 
{
	float salary;

	public Employee(int i, String n, float s) 
	{
		super(i, n); // "super" will inherit all the attributes of "Person" class
		salary = s;
	}

	// method
	public void display() 
	{
		super.personmethod(); // reuse parent class method
		System.out.println(id + "      " + name + "     " + salary);
	}

}
