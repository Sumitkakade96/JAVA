import java.util.*;

class AreaX
{
	public float PI;
	public AreaX()
	{
		this.PI=3.14f;
	}
	public float CalArea(float rad)
	{
		float area=0;
		
		area= (PI * rad * rad);
		
		return area;
	}
}

class assign71
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		AreaX dobj=new AreaX();
		
		System.out.println("Enter the Radius : ");
		float rad=sobj.nextFloat();
		
		float fret=dobj.CalArea(rad);
		System.out.println("Area of circle is: "+fret);
		
	}
}