import java.util.*;

class MyArray
{
	public void ArrayPatternPrint(int arr1[])
	{
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j < arr1[i]; j++)
			{
				System.out.print("*	");
			}
			System.out.println("");
		}
	}
}

class assign545
{
	public static void main(String arg[])
	{
		int Arr[]=null;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int value1=sobj.nextInt();
		
		Arr = new int[value1];
		System.out.println("Enter characters "+value1+" in array");
		for(int i=0;i<value1;i++)
		{
			Arr[i]=sobj.nextInt();
		}

		MyArray mobj=new MyArray();
		
		mobj.ArrayPatternPrint(Arr);
		
	}
}