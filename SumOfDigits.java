package javaBasicProgram;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args)
	{
              Scanner in=new Scanner(System.in);
			  int input;
		      System.out.println("Enter the value to calculate its sum:");
			  input=in.nextInt();
			  in.close();

			  int sum=0;

			  while(input !=0)
			  {
			    int lastdigit=input % 10;
			    sum=sum + lastdigit;
			    input=input / 10;
		      }

			  System.out.println("Sum of its digit is "+sum);
	
			  }
	}
			