import java.util.*;

class DisplayNo
{
	public void Display(int no,int freq)
	{
		//updator
		if(freq < 0)
		{
			freq= -freq;
		}
		
		for(int i=0; i < freq; i++)
		{
			System.out.print("	"+no);
		}
		System.out.println();
	}
}

class assign24
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		DisplayNo dobj=new DisplayNo();
		
		System.out.println("Enter the number first no: ");
		int ino=sobj.nextInt();
		
		System.out.println("Enter the number of Occurence: ");
		int occ=sobj.nextInt();
		
		dobj.Display(ino,occ);
	}
}