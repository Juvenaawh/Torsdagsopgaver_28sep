import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {

    // Declaring a variabel. Modifyer is private. Datatypen int.
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number

        //Instansiere et object af klasse typen Random.
        Random random = new Random();

        //Initialisere variablen rnd_number med et tilfældigt tal mellem 1 og 100.
        rnd_number = random.nextInt(100) + 1;

        //Printer to linjer ud
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");

        //Kalder på metoden
        makeAGuess();
 	}


    private static void makeAGuess(){
        // Create a Scanner object
        Scanner sc = new Scanner(System.in); 

        boolean guessedRight = false;

        while(!guessedRight){

        // Read user input
        int input = sc.nextInt();

        //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        if(input == rnd_number){

        System.out.println("CORRECT");
            guessedRight = true;
        }else{
            System.out.println("Wrong");
            }

            if(input > rnd_number){
            System.out.println("Your guess was to high");

            }else if(input < rnd_number){
            System.out.println("Your guess was to low");
            }


        }
    
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }

}