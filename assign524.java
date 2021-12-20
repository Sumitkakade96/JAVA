import java.util.*;

class MyArray
{
	public int[] ArrayCopyX(int arr1[])
	{
		int icnt=0,arr3[]=null;
		int size=arr1.length;
		arr3 = new int[size];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[icnt]=arr1[i];
			icnt++;
		}
		
		return arr3;
	}
}

class assign524
{
	public static void main(String arg[])
	{
		int Arr[]=null;
		
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
		Crr=mobj.ArrayCopyX(Arr);
		
		System.out.println("Copy of array");
		for(int i=0;i<Crr.length;i++)
		{
			System.out.print("	"+Crr[i]);
		}
		System.out.println("");
	}
}