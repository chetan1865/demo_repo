package javaBasicProgram;

public class TypesOfMethod
{
	public static void test()
	{
		System.out.println("chetan");
	}
	public void test1()
	{
		System.out.println("desai");
	}
	
	static class Demo
	{
		public static void tester()
		{
			System.out.println("chetan");
		}
		public void tester1()
		{
			System.out.println("desai");
		}
		
	}
    public static void main(String[] args) 
	{
    	test();
		TypesOfMethod t=new TypesOfMethod();
		t.test1();
		Demo.tester();
		Demo d =new Demo();
		d.tester1();
		
	}
}
