import java.util.*;

class PrimeNoX
{
	
	/*public void PrimeX(int no)
	{
		int icnt=0,temp=0;
		System.out.println(no+" Prime numbers are: ");
		while(no!=icnt)
		{
			if((temp%2!=0) && ((temp/2)!=0) && (temp/2)%!=0))
			{
				System.out.print(temp+"	");
				icnt++;
			}
			temp++;

		}
		System.out.println();
	}*/
	
	public void PrimeX(int no)
	{
		int icnt=0,temp=2,i=0;
		System.out.println(no+" Prime numbers are: ");
		while(no!=icnt)
		{
			for(i=2;i<temp;i++)
			{
				if(temp%i==0)
				{
					break;
				}
				
			}
			if(i==temp)
			{
				System.out.print(temp+"	");
				icnt++;
			}
			temp++;
		}
		System.out.println();
	}
	
	
}

class primeno
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		PrimeNoX dobj=new PrimeNoX();
		
		System.out.println("Enter the number : ");
		int num1=sobj.nextInt();
		
		dobj.PrimeX(num1);
		
		
	}
}