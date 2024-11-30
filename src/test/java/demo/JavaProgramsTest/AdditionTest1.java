package demo.JavaProgramsTest;

import java.util.Scanner;

public class AdditionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a, b; 
		  int sum; 
		  Scanner sc = new Scanner(System.in); 
		  System.out.print("Enter any two integers: "); 
		  a = sc.nextInt(); 
		  b = sc.nextInt(); 
		  sum = a - ~b - 1; 
		  System.out.print("Sum of two integers: " + sum);

	}

}
