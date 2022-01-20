import java.util.*;

class Check
{
	public int ContainZero(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		int idigit=0;
		while(no!=0)
		{
			idigit = no % 10;
			if(idigit == 0)
			{
				return 1;
			}
			no = no / 10;
		}
		return -1;
		
	}
}

class assign52
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Check dobj=new Check();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		int iret=dobj.ContainZero(ino);
		
		if(iret== -1)
		{
			System.out.println("There is no Zero");
		}
		else
		{
			System.out.println("It contains Zero");
		}
		
	}
}