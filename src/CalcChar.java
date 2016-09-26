import java.lang.Math;
import java.io.*;
import java.util.*;
public class CalcChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This code should be placed inside the main method of a class
		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println(" a. Addition");
		System.out.println(" b. Subtraction");
		System.out.println(" c. Multiplication");
		System.out.println(" d. Division\n");
		System.out.print(" Your choice?");
		Scanner kbReader = new Scanner(System.in);
		String choice = kbReader.next();
		System.out.print("\nEnter first operand. ");
		double op1 = kbReader.nextDouble();
		System.out.print("\nEnter second operand.");
		double op2 = kbReader.nextDouble();
		System.out.println("");
		switch(choice)
		{
		case "a": // addition
		System.out.println(op1 + " plus " +op2 + " = " + (op1 + op2));
		break;
		case "b": //subtraction
		System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
		break;
		case "c": // multiplication
		System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
		break;
		case "d": //division
		System.out.println(op1 + " divided by " + op2 + " = " + (op1/op2));
		break;
		default:
		System.out.println("Hey you! enter only a a, b, c, or d!");
	}

	}
}