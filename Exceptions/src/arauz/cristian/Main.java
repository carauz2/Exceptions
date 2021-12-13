package arauz.cristian;

import java.util.Scanner;
import animal.Animal;
import animal.carnivore.Lion;
import animal.herbivore.Giraffe;

public class Main {

public static void main(String[] args) {
	
	String input;
	Scanner reader = new Scanner(System.in);
	Lion lion = new Lion();
	Giraffe giraffe = new Giraffe();
	

	Animal [] animals = {lion,giraffe};

	System.out.println("There are " + animals.length + " animals in the array.");
	
	System.out.println("Enter a number to find an animal at that location:");
	input = reader.nextLine();
	
	try {
		
		if(Integer.parseInt(input) < 0 || Integer.parseInt(input) >= animals.length) {
			throw new Exception();
		}
		
		else {
			System.out.println(animals[Integer.parseInt(input)].getName());
		}
		
	}
	
	catch(Exception e){
		
		System.out.println("You entered an invalid number!");
	}
	
	finally{
		System.out.println("Goodbye!");
	}
	
	}

}