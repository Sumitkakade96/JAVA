import java.util.*;

class PatternX
{
	
	public void DisplayPattern(int row,int col)
	{
		
		char ch='A';
		for(int i=0; i < row; i++)
		{
			ch='A';
			for(int j=0; j < col; j++)
			{
				System.out.print(ch+"	");
				ch++;
			}
			System.out.println();
		}
	}
}

class assign111
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		PatternX dobj=new PatternX();
		
		System.out.println("Enter the number of rows: ");
		int num1=sobj.nextInt();
		
		System.out.println("Enter the number of coloumns: ");
		int num2=sobj.nextInt();
		
		dobj.DisplayPattern(num1,num2);
		
		
	}
}