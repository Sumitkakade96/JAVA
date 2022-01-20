import java.util.*;

class Check
{
	public int SumOfEvenOdd(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		int idigit=0,icnt=0,ieven1=1,ieven2=1;
		while(no!=0)
		{
			idigit = no % 10;
			if(idigit%2 == 0)
			{
				ieven1 = ieven1 + idigit;
			}
			else
			{
				ieven2 = ieven2 + idigit;
			}
			no = no / 10;
		}
		return ieven1-ieven2;
		
	}
}

class assign65
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Check dobj=new Check();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		int iret=dobj.SumOfEvenOdd(ino);
		System.out.println("diff bet sum of even digits and sum of odd digits: "+iret);
		
	}
}