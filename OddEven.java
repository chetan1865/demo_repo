package javaBasicProgram;

import java.util.Scanner;

public class OddEven 
{
	public static void main(String[] args)
	{

			Scanner sc=new Scanner(System.in);
			int num;

			System.out.print("Enter a number: ");
			num=sc.nextInt();
			sc.close();

			if(num%2==0)
			{
			   System.out.println(num +" is an EVEN number.");
			}
			else
            {
		       System.out.println(num +" is an ODD number.");
            }

	 }
	}
		