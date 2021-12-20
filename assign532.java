import java.util.*;

class MyArray
{
	public int[] SumElemOfArray(int arr1[])
	{
		int val=0,mod=0,mod1=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			val=arr1[i];
			while(val!=0)
			{
				mod = val%10;
				val = val/10;
				mod1 = mod1+mod;
			}
			arr1[i]=mod1;
			mod1=0;
		}
		return arr1;
	}
}

class assign532
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
		Crr=mobj.SumElemOfArray(Arr);
		
		System.out.println("reverse of array elements");
		for(int i=0;i<Crr.length;i++)
		{
			System.out.print("	"+Crr[i]);
		}
		System.out.println("");
	}
}