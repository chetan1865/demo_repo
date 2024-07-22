package javaBasicProgram;

import java.util.Scanner;

public class SquareAndCube 
{
		public static void main(String[] args)
		{

			Scanner input=new Scanner(System.in);
			int num;

			System.out.print("Enter an integer number: ");
			num=input.nextInt();
			input.close();

			System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
			System.out.println("Cube of "+ num + " is: "+ Math.pow(num, 3));
			System.out.println("Square Root of "+ num + " is: "+ Math.sqrt(num));

		}

	}
			