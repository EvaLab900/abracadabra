package homework04;

import java.util.Scanner;
import static java.lang.Math.*;

public class RandomGame {
	
	public static void main(String[] args) {
		
		        int Number = 0;
		        int UsersGuess = 0;
		        int TriesCount = 0;
		        Scanner in = new Scanner(System.in);

		        System.out.println("Let's play! I picked a number from 0 to 100. Try to guess it: ");

		        ActualNumber = 0 + (int)(random() * 100);

		        do {
		        	TriesCount++;
					if (TriesCount > 5) {
						System.out.println("You have run out of tries!");
						break;
					}

					if (TriesCount != 1) {
					System.out.println((6 - TriesCount) + "tries left");
					}else {
						System.out.println((6 - TriesCount) + "try left");
					}
					System.out.print("Enter your number: ");
				
					while(true) {
						if (in.hasNextInt()) {
							UsersGuess = in.nextInt();
			
							if (UsersGuess > ActualNumber) {
								System.out.println("My number is smaller.");
							} else if (UsersGuess < ActualNumber) {            	
								System.out.println("My number is bigger.");	 		 		
							} else { 	
								System.out.println("You win !");
							}
						} else {
							System.out.println("Please, try again.");
							in.next();
						}
					}	
		        } while (UsersGuess != ActualNumber );
		        
		        in.close();


		    }

	}

