package demo.JavaProgramsTest;

import java.util.Scanner;

public class ArithmeticOperationsTest {
	
	public static void main(String[] args) {
	
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();  


    double sum = add(num1, num2);
    System.out.println("Sum:  " + sum);
    
    double sub = sub(num1, num2);
    System.out.println("Sub:  " + sub);
    
    scanner.close();
}

public static double add(double num1, double num2) {
    return num1 + num2;
}

public static double sub(double num1, double num2) {
	System.out.println(num1);
    return num1 - num2;
}


}
