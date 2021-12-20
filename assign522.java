import java.util.*;

class MyArray
{
	public void DisplaySmall(int arr1[],int arr2[])
	{
		int small=arr1[0];
		for(int i=0;i<arr1.length;i++)
		{
			if((arr1[i]) < small)
			{
				small=arr1[i];
			}
		}
		System.out.println("Smallest element of first array is :"+small);
		small=arr2[0];
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] < small)
			{
				small=arr2[i];
			}
		}
		System.out.println("Smallest element of second array is :"+small);
		
	}
}

class assign522
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
		
		mobj.DisplaySmall(Arr,Brr);
	}
}