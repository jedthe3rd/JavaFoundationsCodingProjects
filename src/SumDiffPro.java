/*
@JEDIII
*/
import java.util.Scanner;
public class SumDiffPro{
	public static void main(String[] args)
	{
		Scanner floats = new Scanner(System.in);
		
		System.out.println("Give me three numbers to find the sum, difference, and product of:");
		float one = floats.nextFloat();
		float two = floats.nextFloat();
		float three = floats.nextFloat();
		
		float sum = one + two + three;
		float difference = one - two - three;
		float product = one * two * three;
		
		System.out.println("The Sum of your numbers: " + sum);
		System.out.println("The Difference of your numbers: " + difference);
		System.out.println("The Product of your numbers: " + product);
	}
}