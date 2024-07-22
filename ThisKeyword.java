package javaBasicProgram;

public class ThisKeyword 
{	
    int a;
	String name;
	
	public ThisKeyword(int i, String name) 
	{
		this.a=i;
		this.name=name;
	}
	public void Students(int i)
	{
		System.out.println(i);
		int a=90;
		System.out.println(a);
		System.out.println(this.a);
	}
	public void Display()
	{
		int b=999;
		System.out.println(b);
		System.out.println(this.name);
	}
	
	public static void main(String[] args) 
	{
		ThisKeyword k1=new ThisKeyword(101,"chetan");
		k1.Students(500);
		k1.Display();
	}
}
