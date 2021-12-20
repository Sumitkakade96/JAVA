import java.util.*;

class MyArray
{
	public void DisplayClassArray(float arr1[])
	{
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] < 35)
			{
				System.out.println(+arr1[i]+"	Fail");
			}
			else if(arr1[i] >= 35 && arr1[i] < 50)
			{
				System.out.println(+arr1[i]+"	Pass class");
			}
			else if(arr1[i] >=50 && arr1[i] < 60)
			{
				System.out.println(+arr1[i]+"	Second class");
			}
			else if(arr1[i] >= 60 && arr1[i] < 70)
			{
				System.out.println(+arr1[i]+"	First class");
			}
			else if(arr1[i] >= 70 && arr1[i] < 100)
			{
				System.out.println(+arr1[i]+"	First class with distinction");
			}
		}
	}
}

class assign535
{
	public static void main(String arg[])
	{
		float Arr[]=null;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int value1=sobj.nextInt();
		
		Arr = new float[value1];
		System.out.println("Enter  "+value1+" elements");
		for(int i=0;i < value1;i++)
		{
			Arr[i]=sobj.nextFloat();
		}
		
		MyArray mobj=new MyArray();
		
		mobj.DisplayClassArray(Arr);
	}
}