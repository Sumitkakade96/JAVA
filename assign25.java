import java.util.*;

class CheckEven
{
	public int IsEven(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		
		if(no%2 == 0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

class assign25
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		CheckEven dobj=new CheckEven();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		int ans=dobj.IsEven(ino);
		
		if(ans == 1)
		{
			System.out.println("Number is Even ");
		}
		else 
		{
			System.out.println("Number is Odd ");
		}
	}
}