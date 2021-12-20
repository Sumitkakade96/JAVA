import java.util.*;

class MyArray
{
	public int[] ArrayConcat(int arr1[],int arr2[])
	{
		int icnt=0,arr3[]=null;
		int size=arr1.length + arr2.length;
		arr3 = new int[size];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[icnt]=arr1[i];
			icnt++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[icnt]=arr2[i];
			icnt++;
		}
		
		return arr3;
	}
}

class assign514
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
		
		int Crr[]=new int[value1+value2];
		Crr=mobj.ArrayConcat(Arr,Brr);
		
		System.out.println("Combination of 2 arrays elements");
		for(int i=0;i<Crr.length;i++)
		{
			System.out.print("	"+Crr[i]);
		}
		System.out.println("");
	}
}