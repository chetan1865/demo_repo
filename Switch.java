package javaBasicProgram;

public class Switch 
{
	public static void main(String[] args)
    {
		int day=4;
String dayString="";

	switch(day)
	{
	case 1:dayString="mon";
	break;
	case 2:dayString="tue";
	break;
	case 3:dayString=" wed  ";
	break;
	case 4:dayString=" thu  ";
	break;
	case 5:dayString=" fri  ";
	break;
	case 6:dayString=" sat  ";
	break;
	case 7:dayString=" sun  ";
	break;
	default:System.out.println("wrong input");
	}
	System.out.println(dayString);
	  }
    
}
