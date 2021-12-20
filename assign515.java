import java.util.*;

class MySumArray
{
	public void DisplaySum(int arr1[],int arr2[])
	{
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum=sum+arr1[i];
		}
		System.out.println("Sum of first array is :"+sum);
		sum=0;
		
		for(int i=0;i<arr2.length;i++)
		{
			sum=sum+arr2[i];
		}
		System.out.println("Sum of second array is :"+sum);
		
	}
}

class assign515
{
	public static void main(String arg[])
	{
		int Arr[]=null;
		int Brr[]=null;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int value1=sobj.nextInt();
		
		Arr = new int[value1];
		System.out.println("Enter "+value1+" elements");
		for(int i=0;i<value1;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		
		System.out.println("Enter the size of second array");
		int value2=sobj.nextInt();
		
		Brr = new int [value2];
		System.out.println("Enter "+value2+" elements");
		for(int i=0;i<value2;i++)
		{
			Brr[i]=sobj.nextInt();
		}
		
		MySumArray mobj = new MySumArray();
		
		mobj.DisplaySum(Arr,Brr);
	}
}