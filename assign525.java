import java.util.*;

class MyArray
{
	public boolean ArrayPalindrome(int arr1[])
	{
		int size=arr1.length;
		int brr[]=new int[size];
		
		int j=0;
		for(int i=(size-1);i>=0;i--)
		{
			brr[j]=arr1[i];
			j++;
		}
		
		for(int i=0;i<size;i++)
		{
			if(brr[i]==arr1[i])
			{}
			else
			{
				return false;
			}
		}
	return true;
	}
}

class assign525
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
		
		boolean bret=mobj.ArrayPalindrome(Arr);
		if(bret==true)
		{
			System.out.println("array is palindrome");
		}
		else
		{
			System.out.println("array is not palindrome");
		}
		
		System.out.println("");
	}
}