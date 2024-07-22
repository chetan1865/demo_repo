package javaBasicProgram;

public class LoopClass 
{
	 public void  test()
	 {
			String name="chetaan";
			
			char arr[]=name.toCharArray();
			
			for(int i=0;i<=arr[i]-1;i++)
			{
				System.out.println(arr[i]);
			}
	
	 }
	 
	 public static void main(String[] args) 
	 {
		 for(int a=0;a<=5;a++)
		 {
		 LoopClass n =new LoopClass();
		 n.test();
		 }
	 }
	
}