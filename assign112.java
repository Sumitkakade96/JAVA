import java.util.*;

class PatternX
{
	
	public void DisplayPattern(int row,int col)
	{
		
		char ch='A',ch1;
		for(int i=1; i <= row; i++)
		{
			ch='A';
			for(int j=1; j <= col; j++)
			{
				if(i%2==0)
				{
					int con=(char)ch;
					ch1 =(char)(con+32);
					System.out.print(ch1+"	");
				}
				else
				{
					System.out.print(ch+"	");
				}
				ch++;
			}
			System.out.println();
		}
	}
}

class assign112
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