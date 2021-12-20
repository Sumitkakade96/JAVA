import java.util.*;

class MyArray
{
	public int DiffArray(int arr1[],int arr2[])
	{
		int sum1=0,sum2=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum1=sum1+arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			sum2=sum2+arr2[i];
		}
		
		return sum1-sum2;
	}
}

class assign521
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
		
		MyArray mobj = new MyArray();
		
		int diff=mobj.DiffArray(Arr,Brr);
		
		System.out.println("Sum of difference of array is :"+diff);
	}
}