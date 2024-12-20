package fi.git;

import java.util.Scanner;

public class SumOfLargestNumber {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the third number: ");
		int num3 = sc.nextInt();
		
		int largest = Math.max(num1, Math.max(num2,num3));	
		
		int sum = 0;
		
		while(largest != 0)
		{
			int res = largest % 10;
			sum = sum + res;
			largest = largest / 10;
		}
		
		System.out.println("The sum of largest number is : " +sum);
		
		sc.close();
		
	}

}
