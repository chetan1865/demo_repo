package javaBasicProgram;

import java.util.Scanner;

public class LeapYear 
{

		public static void main(String[] args)
			{
			  int year;
			  Scanner sc=new Scanner (System.in);

		    	System.out.print("Enter year:");
			    year=sc.nextInt();
			    sc.close();

			   if((year %400==0)||(year %100 !=0 && year %4==0))
			   {
			   System.out.println(year+" is a Leap Year.");
			   }
		
			   else
	
			System.out.println(year+" is not a Leap Year.");
			}
	}
			