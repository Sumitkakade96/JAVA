import java.util.*;

class AreaX
{
	
	public float AreaOfRect(float wd, float ht)
	{
		float area=0;
		
		area= (wd * ht);
		
		return area;
	}
}

class assign72
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		AreaX dobj=new AreaX();
		
		System.out.println("Enter the width : ");
		float widt=sobj.nextFloat();
		
		System.out.println("Enter the height : ");
		float high=sobj.nextFloat();
		
		float fret=dobj.AreaOfRect(widt,high);
		System.out.println("Area of Rectangle is: "+fret);
		
	}
}