import java.util.*;

class Check
{
	public void DisplayFactor(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		int ans=1,i;
		for(i =(no/2); i>= 1; i--)
		{
			if((no%i)==0)
			{
				System.out.print("	"+i);
			}
		}
		System.out.println();
	}
}

class assign42
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Check dobj=new Check();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		dobj.DisplayFactor(ino);
		
	}
}