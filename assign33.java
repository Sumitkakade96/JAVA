import java.util.*;

class CheckEven
{
	public void DisplayEvenFact(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		
		for(int i=1; i<= (no/2); i++)
		{
			if( (i % 2 == 0) && ((no % i) ==0))
			{
				System.out.print("	"+i);
			}
		}
		System.out.println();
	}
}

class assign33
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		CheckEven dobj=new CheckEven();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		dobj.DisplayEvenFact(ino);
		
	}
}