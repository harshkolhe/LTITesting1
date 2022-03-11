package Strings;

public class StringBuilderClass 
{

	public static void main(String[] args) 
	{
		//create mutable string using StringBuilder class 
		StringBuilder sb= new StringBuilder("Hello ");
		System.out.println("String is :"+sb);
		
		//append World along with existing string
		sb.append("World");
		System.out.println("After appending, string is :"+sb);
		
		//insert
		sb.insert(11, ", Harsh");
		System.out.println("After inserting, string is : "+sb);
		
		//reverse
		sb.reverse();
		System.out.println("After reverse, string is: "+sb);
		
		//reverse1
		sb.reverse();
		System.out.println("After reverse, string is: "+sb);
		
		//delete
		sb.delete(11,20);
		System.out.println("after deleting, string is: "+sb);
		
		//replace
		sb.replace(0, 6, "*");
		System.out.println("After replacing, string is: "+sb);
		
		//length of string
		System.out.println(sb.length());
		

	}

}
