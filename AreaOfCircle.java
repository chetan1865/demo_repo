package javaBasicProgram;

import java.util.Scanner;

public class AreaOfCircle
{
      public static void main(String[] args)
    	{
    	int r;
    	Scanner s=new Scanner(System.in);		
	    //System.out.println("Enter the radius of the circle:");
		r=s.nextInt();
        double area=Math.PI*r*r;
        System.out.println("Area of the circle is " + area);
        s.close();
		}
}
			