package javaBasicProgram;

import java.util.Scanner;

public class SumOfnNO
{
			public static void main(String[] args)
			{

			  int n;
			  int temp=0;
			  Scanner in=new Scanner(System.in);

			  System.out.println("Enter the value for 'n':");
			  n=in.nextInt();
			  in.close();

		     for(int i=0; i<=n; i++)
		     {
			    temp=temp + i;
			 }

			System.out.println("The Sum upto "+ n+" is: "+temp);

			}
}		