package javaBasicProgram;

import java.util.Scanner;

public class Palindrome
{
			public static void main(String[] args)
			{

			int num;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter num:");
			num=in.nextInt();
			in.close();

			int a=num;
			int reverse=0;
			int remainder;

			while(num > 0)
			{
		       remainder=num % 10;
			   reverse=reverse * 10 + remainder;
			   num=num / 10;
			}

			if(reverse==a)
			  System.out.println(a+" is a Palindrome Number");
			  else
			  System.out.println(a+" is not a Palindrome Number");;
    }
}
			