import java.util.*;

class MyArray
{
	public int ArrayCountDiff(char arr1[])
	{
		int icnt1=0,icnt2=0;
		
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] >= 65 && arr1[i] <= 90)
			{
				icnt1++;
			}
			else if(arr1[i] >=97 && arr1[i] <= 122)
			{
				icnt2++;
			}
		}

		return icnt1-icnt2;
	}
}

class assign544
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
		
		int bret=mobj.ArrayCountDiff(Arr);
		
		System.out.println("occurance in array is "+bret);
		
	}
}