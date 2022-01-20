import java.util.*;

class Check
{
	public int CountBetween(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		int idigit=0,icnt=0;
		while(no!=0)
		{
			idigit = no % 10;
			if(idigit > 3 && idigit < 7)
			{ 
				icnt++;
			}
			no = no / 10;
		}
		return icnt;
		
	}
}

class assign63
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Check dobj=new Check();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		int iret=dobj.CountBetween(ino);
		System.out.println("Number of digits bet 3 and 7: "iret);
		
	}
}