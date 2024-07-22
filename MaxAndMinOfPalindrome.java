package javaBasicProgram;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxAndMinOfPalindrome 
{
	public static void palindrome()
	{
		String a="my wow is chetan kayak";
		String[] word=a.split(" ");
	
		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0;i<word.length;i++)
		{
			boolean f=false;
			String input=word[i];
			input=input.toLowerCase();
			for(int j=0;j<input.length()/2;j++)
			{
				if(input.charAt(j)==input.charAt(input.length()-1-j))
				{
					  // System.out.println("String is palindrome");
                      	f=true;
				}
				else
				{
				  // System.out.println("String is not palindrome");
				}			
			}
			if(f)
			{
				hm.put(word[i],word[i].length());
			}	
		}
		System.out.println(hm);
		int max=Collections.max(hm.values());
		int min=Collections.max(hm.values());
		
		for(Entry<String,Integer>entry:hm.entrySet())
		{
			if(entry.getValue()==max)
			{
				System.out.println("max words:"+entry.getKey());
			}
			if(entry.getValue()==min)
			{
				System.out.println("min words:"+entry.getKey());
			}
         }
         
	}
public static void main(String[] args)
{
		palindrome();
}
}
