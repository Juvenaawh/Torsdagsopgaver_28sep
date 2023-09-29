import java.util.Scanner;

// 2.a: create a Main class with a main method.
class Main{

	public static void main(String [] args){
	
	// 2.c: Create a Scanner object for reading the command line 
	// (remember to import the Scanner class from the util library: import java.util.Scanner;)
	Scanner sc = new Scanner(System.in);
	// 2.b: In the main method start by printing a message to the user: "Please type your name".
	System.out.println("Please type your name");

	// 2.d: Declare a String variable, name and assign it the content of the scanner's call to nextLine().
	String name = sc.nextLine();

	// 2.e: Print the name of the user in a greeting, followed by the message "Please type your age"
	System.out.println("\nWelcome " + name + "!");
	System.out.println("\nPlease state your age");

	// 2.f: Declare another variable of type int, age and assign it the value returned by the nextInt method of the Scanner object.
	int age = sc.nextInt();

	// 2.g: Print the value the user writes (the age variable)
	System.out.println("\nYou are " + age);

	// 2.h: Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. 
	// You may assume retirement starts at 67 years. Print the result.
	int calculateRetirement = 67 - age;
	System.out.println("And you can retire in " + calculateRetirement + " years. " + "Yay you...");
	}
	
}