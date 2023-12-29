// Tile : CODSOFT INTERNSHIP TASK 4 (NUMBER GAME CODE)
// Author : Omkar Vartak

import java.util.*;
public class Number_game
{

	public static void main(String[] args)
	{
		int no,random_no,attempt;
		Scanner sc = new Scanner (System.in);
		Random rnd = new Random();
		random_no = rnd.nextInt(100) + 1;
		System.out.println("\n\t Welcome to the Number Guessing Game......");
		System.out.println("\n\tYou will get only 10 attempts to guess the number.");
		for(attempt=10;attempt>=1;attempt--)
		{
		System.out.println("\n\t Enter The number you want to Guess in between 1 to 100");
		no = sc.nextInt();
		System.out.println("\n\t No of Attepts Remaining : "+(attempt-1));
		if(no==random_no)
		{
			System.out.println("\n\t Awesome!!!! You have Guessed the Number");
			System.out.println("\n\t Congratulations");
			break;
		}
		else if(no<0 || no>100)
		{
			System.out.println("You Have entered an invalid Number.");
			System.out.println("\n\t You have to Guess a Number in between 1 to 100");
			System.out.println("\n\t So Enter value in between 1 to 100 including 1 and 100");
		}
		else if(no < random_no)
		{
			System.out.println("\n\t Sorry Not a Correct guess. The number is Higher ");
			System.out.println("\n\t Keep Guessing with more higher numbers.");
		}
		else
		{
			System.out.println("\n\t Sorry Not a Correct guess. The number is Lower");
			System.out.println("\n\t Keep Guessing with lower valued numbers.");
		}
		}
		System.out.println("\n\t Thank you Round is Over....");
		
		
	}

}
