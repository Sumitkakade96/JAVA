import java.util.*;

class CheckEven
{
	public void DisplayEven(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		int icnt=0,i=1;
		while(icnt < no)
		{
			if( i % 2 == 0)
			{
				System.out.print("	"+i);
				icnt++;
			}
			i++;
		}
		System.out.println();
	}
}

class assign31
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		CheckEven dobj=new CheckEven();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		dobj.DisplayEven(ino);
		
	}
}