
import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
	


	public static void main(String[] args) {
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
		Scanner input = new Scanner(System.in);
		int sides;
		int rolls = 1;
		String again;
		boolean dice = true;
		
		while (dice = true) {
			
			System.out.println("How many sides does your dice have?");
			sides = input.nextInt();
			
			System.out.println("Roll" + rolls + ":");
			int r1 = generateRandomDieRoll(sides);
			int r2 = generateRandomDieRoll(sides);
			System.out.println(r1);
			System.out.println(r2);
			
			rolls++;
			System.out.println("Again? y/n");
			again = input.next();
			
			
				}
			
		}
		
	
	public static int generateRandomDieRoll (int dice) {
		Random  rand = new Random();
		
		int num1 = rand.nextInt(sides);
		return num1 + 1;
	}

}

	// simulate role of d6 and print the result
		
	/*Random r = new Random() ;
	
	int result = 0;
			
	for	(int i = 0; i < 50; i++) {	
	r.nextInt(6);  // gives us a result between 0 and 5
	result = result + 1;
	
	System.out.println("You rolled a "+result);
	}*/

