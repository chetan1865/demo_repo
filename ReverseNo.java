package javaBasicProgram;

import java.util.Scanner;

public class ReverseNo 
{
	public static void main(String[] args)
	{

			int num;
			int remainder;
			int result=0;
			Scanner in=new Scanner(System.in);

			System.out.println("Enter num:");
			num=in.nextInt();
			in.close();

			while(num>0)
			{
			   remainder=num%10;
			   result=result * 10 + remainder;
			   num=num/10;
			}

			System.out.println("Reverse of the Number is : "+result);
			}
	}
			