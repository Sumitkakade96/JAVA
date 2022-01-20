import java.util.*;

class DisplayX
{
	public void Display(int no)
	{
		if(no < 0)	//updator
			no= -no;
		
		for(int i=0; i < no; i++)
		{
			System.out.print("*	");
		}
		System.out.println();
	}
}

class assign15
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		DisplayX dobj=new DisplayX();
		
		System.out.println("Enter the number For display *: ");
		int ino=sobj.nextInt();
		
		dobj.Display(ino);
	}
}