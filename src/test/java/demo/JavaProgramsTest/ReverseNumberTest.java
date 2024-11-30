package demo.JavaProgramsTest;

import java.util.Scanner;

public class ReverseNumberTest {
	
	 public static void main(String[] args)  
	 { 
	  Scanner sc = new Scanner(System.in); 
	  int num, r, reverse = 0; 
	  System.out.print("Enter any number: "); 
	  num = sc.nextInt(); 
	  while (num != 0)  
	  { 
	   r = num % 10; 
	   reverse = reverse * 10 + r; 
	   num = num / 10; 
	  } 
	  System.out.println("Reversed of number: " + reverse); 
	 }

}
