import java.util.*;

class MyArray
{
	public void ArrayReplace(char arr1[])
	{

		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] >= 65 && arr1[i] <= 90)
			{
				int ch = arr1[i];
				ch = ch + 32;
				char ch1=(char)ch;
				arr1[i]= ch1;
			}
		}
		System.out.println("");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("	"+arr1[i]);
		}
		System.out.println("");
	}
}

class assign541
{
	public static void main(String arg[])
	{
		char Arr[]=null;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int value1=sobj.nextInt();
		
		Arr = new char[value1];
		System.out.println("Enter characters "+value1+" in array");
		for(int i=0;i<value1;i++)
		{
			Arr[i]=sobj.next().charAt(0);
		}
		
		MyArray mobj=new MyArray();
		
		mobj.ArrayReplace(Arr);
		
		//System.out.println("capital letters in array is "+bret);
		
	}
}