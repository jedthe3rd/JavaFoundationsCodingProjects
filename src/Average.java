/*
 *@JEDIII
 */
import java.util.Scanner;

public class Average {
	public static void main (String[] args)
	{
		Scanner numbers = new Scanner(System.in);
		System.out.println("Give me the three #'s you want to average?");
		int one = numbers.nextInt();
		int two = numbers.nextInt();
		int three = numbers.nextInt();
		
		int average = (one + two + three)/3;
		
		System.out.println("Your #'s averaged: " + average);
		
	}
}