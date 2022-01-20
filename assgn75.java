import java.util.*;

class Square
{
	
	public float SquareMeter(float sqr)
	{
		float area=0.0f;

		area = (sqr * (0.0929f));
		
		return area;
	}
}

class assign75
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		Square dobj=new Square();
		
		System.out.println("Enter the Area in square feet : ");
		float tmp=sobj.nextFloat();

		
		float fret=dobj.SquareMeter(tmp);
		System.out.println("square feet into square meter is: "+fret);
		
	}
}