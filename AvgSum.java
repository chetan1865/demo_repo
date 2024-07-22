package javaBasicProgram;

import java.util.Scanner;

public class AvgSum
{

			public static void main(String[] args)
			{

			int a,b,sum;
			float avg;


			Scanner input=new Scanner(System.in);

			System.out.print("Enter first number : ");
			a=input.nextInt();

			System.out.print("Enter second number : ");
			b=input.nextInt();

			/*Calculate sum and average*/
			sum=a+b;
			avg=(float)((a+b)/2);

			System.out.print("Sum : " +sum +"\nAverage : " +avg);
input.close();

			}

			}
			