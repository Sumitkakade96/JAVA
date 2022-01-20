import java.util.*;

class TemperatureX
{
	
	public float TempInFehrenheit(float fah)
	{
		float temp=0.0f;

		temp = ((fah-32)*(5/9f));
		
		return temp;
	}
}

class assign74
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		TemperatureX dobj=new TemperatureX();
		
		System.out.println("Enter the temperature : ");
		float tmp=sobj.nextFloat();

		
		float fret=dobj.TempInFehrenheit(tmp);
		System.out.println("Temperature in celsius is: "+fret);
		
	}
}