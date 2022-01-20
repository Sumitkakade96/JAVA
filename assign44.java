import java.util.*;

class CheckEven
{
	public void SumOfNonFact(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		int sum=0;
		for(int i=1; i<= no; i++)
		{
			if(no%i == 0)
			{
			}
			else
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of odd factors are: "+sum);
	}
}

class assign44
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		CheckEven dobj=new CheckEven();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		dobj.SumOfNonFact(ino);
		
	}
}