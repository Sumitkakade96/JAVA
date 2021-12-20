import java.util.*;

class MyArray
{
	public int[] ArrayRev(int arr1[])
	{
		int size=arr1.length;
		int brr[]=new int[size];
		
		int j=0;
		for(int i=(size-1);i>=0;i--)
		{
			brr[j]=arr1[i];
			j++;
		}
	return brr;
	}
}

class assign523
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

		MyArray mobj = new MyArray();
		
		int Crr[]=new int[value1];
		Crr=mobj.ArrayRev(Arr);
		
		System.out.println("Reverse array");
		for(int i=0;i<Crr.length;i++)
		{
			System.out.print("	"+Crr[i]);
		}
		System.out.println("");
	}
}