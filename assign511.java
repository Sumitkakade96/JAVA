import java.util.*;

class MyArray
{
	public void Display(int arr1[],int arr2[])
	{
		System.out.println("Elements of first array");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("	"+arr1[i]);
		}
		System.out.println("");
		System.out.println("Elements of second array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print("	"+arr2[i]);
		}
		System.out.println("");
	}
}

class assign511
{
	public static void main(String arg[])
	{
		int Arr[]=null;
		int Brr[]=null;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter size for first array");
		int value1=sobj.nextInt();
		
		Arr =new int[value1];
		System.out.println("Enter "+value1 +" elements");
		for(int i=0;i<value1;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		
		System.out.println("Enter size for second array");
		int value2=sobj.nextInt();
		
		Brr = new int[value2];
		System.out.println("Enter "+value2 +" elements");
		for(int i=0;i<value2;i++)
		{
			Brr[i]=sobj.nextInt();
		}
		
		MyArray mobj=new MyArray();
		
		mobj.Display(Arr,Brr);
	}
}