/* Abstraction is basically hiding the execution of the internal/sensitive details 
 * from the user and showing the important and required functionality to the users.
 * 
 * For Example: Like driving a car, the owner of the car doesnt need to know the internal implementation of how the car works,
 * but he knows how to drive a car and also familiar with the various functions of the car*/

package Abstraction;

abstract class abstract_example 
{
	abstract void chris(); //abstract method
	
	public void chris(String c) //concrete method
	{
		System.out.println("This is a concrete method of abstract_example class"); //body of concrete method
	}

}

