/* Abstraction is basically hiding the execution of the internal/sensitive details 
 * from the user and showing the important and required functionality to the users.*/

package Abstraction;

public class abstract_main extends abstract_example{
	public static void main(String[] args) 
	{
		abstract_example object =  new abstract_main(); //Accessing data members of abstract_example by using the instance of abstract_main
		//System.out.println("hello " + object.c);
		object.chris("c"); //calling concrete method
		object.chris(); //calling abstract method
	}
	@Override
	void chris() //Body of an abstract method chris() in the subclass i.e abstract_main
	{
		System.out.println("Body of an abstract method");
	}

}
