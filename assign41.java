import java.util.*;

class Check
{
	public void MultiplicationOfFact(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		int ans=1;
		for(int i=1; i<= (no/2); i++)
		{
			if((no%i)==0)
			{
				ans = (ans * i);
			}
		}
		System.out.println("Multiplication of factor is: "+ans);
	}
}

class assign41
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Check dobj=new Check();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		dobj.MultiplicationOfFact(ino);
		
	}
}