import java.util.*;

class Check
{
	public int MultDigit(int no)
	{
		//updator
		if(no < 0)
		{  
			no= -no;
		}
		int idigit=0,imult=1;
		while(no!=0)
		{
			idigit = no % 10;
			imult= imult * idigit;
			no = no / 10;
		}
		return imult;
		
	}
}

class assign64
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Check dobj=new Check();
		
		System.out.println("Enter the number : ");
		int ino=sobj.nextInt();
		
		int iret=dobj.MultDigit(ino);
		System.out.println("Multiplication of digits is: "+iret);
		
	}
}