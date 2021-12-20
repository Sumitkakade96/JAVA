import java.util.*;

class MyArray
{
	public int ArrayCountOcc(char arr1[],char str)
	{
		int icnt=0;
		if(str >=65 && str <=90)
		{
			int str1=str;
			str1=str1 + 32;
			str=(char)str1;
		}
		
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
		for(int i=0;i<arr1.length;i++)
		{
			if(str == arr1[i])
			{
				icnt++;
			}
		}
		return icnt;
	}
}

class assign543
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
		System.out.println("enter element to search");
		char ch=sobj.next().charAt(0);
		
		MyArray mobj=new MyArray();
		
		int bret=mobj.ArrayCountOcc(Arr,ch);
		
		System.out.println("occurance in array is "+bret);
		
	}
}