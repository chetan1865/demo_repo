package javaBasicProgram;

import java.util.Scanner;

public class Fibbonaci 
{

	public static void main(String[] args)
	{

		int num;
		Scanner in=new Scanner(System.in);

			System.out.println("Enter num:");
			num=in.nextInt();
			in.close();

			int f1, f2=0, f3=1;

       	    for(int i=1;i<=num;i++)
       	    {
			   System.out.print(f3+" ");
			   f1=f2;
			   f2=f3;
			   f3=f1 + f2;
			}
		}	
	}
			