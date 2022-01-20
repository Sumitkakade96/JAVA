import java.util.*;

class DivisibleX
{
	public int IsDivisible(int no)
	{
		if(no < 0)	//updator
			no= -no;
		
		if(no % 5 == 0)
		{
			return  1;
		}
		else
		{
			return -1;
		}
		
	}
}

class assign14
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		DivisibleX dobj=new DivisibleX();
		
		System.out.println("Enter the number: ");
		int ino=sobj.nextInt();
		
		int ans=dobj.IsDivisible(ino);
		
		if(ans == -1)
		{
			System.out.println("Number is not divisible by 5 ");
		}
		else
		{
			System.out.println("Number is Divisible by 5 ");
		}
	}
}