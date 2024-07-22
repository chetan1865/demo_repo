package javaBasicProgram;

import java.util.Scanner;

public class ArmstrongNos
{

	public static void main(String[] args)
			{

			int num;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter num:");
			num=in.nextInt();
			in.close();

			int a=num;
			int check=0;
			int remainder;

			while(num > 0)
			{
			   remainder=num % 10;
			   check=check + (int)Math.pow(remainder,3);
			   num=num / 10;
			}

			if(check==a)
			   System.out.println(a+" is an Armstrong Number");
			   else
			   System.out.println(a+" is not an Armstrong Number");
			}
		}
			