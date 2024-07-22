package javaBasicProgram;

import java.util.Scanner;

public class Factorial 
{
			public static void main(String[] args)
			{
			   Scanner in=new Scanner(System.in);
			   int input;
			   System.out.println("Enter the value to find Factorial:");
			   input=in.nextInt();
			   in.close();

			   int result=1;

		       while(input > 0)
		       {
		          result=result * input;
			      input --;
		       }
               System.out.println("Factorial of the given No. is " + result);;
	           }
			
		
}