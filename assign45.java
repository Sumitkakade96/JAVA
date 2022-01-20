import java.util.*;

class Check
{
	public void DiffOfFact(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		int sum1=0,sum2=0;
		for(int i=1; i< no; i++)
		{
			if(no%i == 0)
			{
				sum2= sum2 + i;
			}
			else
			{
				sum1 = sum1 + i;
			}
		}
		System.out.println("diff of factors are: "+(sum2-sum1));
	}
}

class assign45
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Check dobj=new Check();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		dobj.DiffOfFact(ino);
		
	}
}