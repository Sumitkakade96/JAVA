import java.util.*;

class Check
{
	public void CheckVowel(char chr)
	{
		if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' || chr == 'A' || chr == 'E' || chr == 'I' || 
		chr == 'O' || chr == 'U' )
		{
			System.out.println("Its a vowel ");
		}
		else 
		{
			System.out.println("Its not a vowel ");
		}
		
	}
}

class assign35
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Check dobj=new Check();
		
		System.out.println("Enter the Character to check Vowel or not: ");
		char ch=sobj.next().charAt(0);
		
		dobj.CheckVowel(ch);
		
	}
}