import java.util.*;

class MyEvenArray
{
	public void DisplayEven(int arr1[],int arr2[])
	{
		System.out.println("Even elements of first array");
		for(int i=0;i<arr1.length;i++)
		{
			if(((arr1[i])%2)==0)
			{
				System.out.print("	"+arr1[i]);
			}
		}
		System.out.println("");
		
		System.out.println("Even elements of second array");
		for(int i=0;i<arr2.length;i++)
		{
			if(((arr2[i])%2)==0)
			{
				System.out.print("	"+arr2[i]);
			}
		}
		System.out.println("");
		
	}
}

class assign512
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
		
		MyEvenArray mobj = new MyEvenArray();
		
		mobj.DisplayEven(Arr,Brr);
	}
}