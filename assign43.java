import java.util.*;

class CheckEven
{
	public void DisplayNonFact(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		
		for(int i=1; i<= no; i++)
		{
			if(no%i == 0)
			{
			}
			else
			{
				System.out.print("	"+i);
			}
		}
		System.out.println();
	}
}

class assign43
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		CheckEven dobj=new CheckEven();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		dobj.DisplayNonFact(ino);
		
	}
}