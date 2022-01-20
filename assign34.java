import java.util.*;

class Check
{
	public void CharConvert(char chr)
	{
		if(chr >= 'a' && chr <= 'z')
		{
			int ascii=(int)chr;
			chr =(char)(ascii - 32);
			
			System.out.println(chr);
		}
		else if(chr >= 'A' && chr <= 'Z')
		{
			int ascii=(int)chr;
			chr =(char)(ascii + 32);
			
			System.out.println(chr);
		}
	}
}

class assign34
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Check dobj=new Check();
		
		System.out.println("Enter the Character : ");
		char ch=sobj.next().charAt(0);
		
		dobj.CharConvert(ch);
		
	}
}