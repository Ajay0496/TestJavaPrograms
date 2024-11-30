package demo.JavaProgramsTest;

import java.util.Scanner;

public class SumOfDigitsTest {
	
	public static void main(String[] args)  
	{ 
	Scanner sc = new Scanner(System.in); 
	int num, sum = 0, r; 
	System.out.println("Enter a number: "); 
	num = sc.nextInt(); 
	while (num != 0) { 
	r = num % 10; 
	num = num / 10; 
	sum = sum + r; 
	} 
	System.out.print("Sum of digits of number:  " + sum); 
	} 

}
