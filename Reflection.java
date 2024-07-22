package javaBasicProgram;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection 
{
        public static void main(String[] args) 
        {
		Reflection2 r=new Reflection2();
		
		Class<? extends Reflection2> c=r.getClass();
		System.out.println(c.getName());
		
		Field[] f=c.getDeclaredFields();
		for(Field fl:f)
		{
			System.out.println(fl.getName());
		}
		
		Method[] m=c.getDeclaredMethods();
		for(Method m1:m)
		{
			System.out.println(m1.getName());
		}
	}
}