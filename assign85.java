import java.util.*;

class NumberX
{
	
	public void DisplayNoInRange(int no1,int no2)
	{
		if(no2 < no1)
		{
			System.out.print("Invalid Range");
			return;
		}
		System.out.println("Reverse Numberes in bet "+no1+" and "+no2+" are:");
		
		for(int i=no2; i >= no1; i--)
		{
			System.out.print("	"+i);
		}
		System.out.println();
	}
}

class assign85
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		NumberX dobj=new NumberX();
		
		System.out.println("Enter the first number : ");
		int num1=sobj.nextInt();
		
		System.out.println("Enter the second number : ");
		int num2=sobj.nextInt();
		
		dobj.DisplayNoInRange(num1,num2);
		
		
	}
}