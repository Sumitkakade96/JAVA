import java.util.*;

class assign11
{
	public static float DivideNo(int no1,int no2)
	{
		if(no2 <= 0)
			return -1;
		if(no2 > no1)
			return -1;
		
		float ans=no1 / no2;
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter First number: ");
		int ino1=sobj.nextInt();
		
		System.out.println("Enter Second number: ");
		int ino2=sobj.nextInt();
		
		float ans1=DivideNo(ino1,ino2);
		
		if(ans1 == -1)
		{
			System.out.println("Division is not possible ");
		}
		else
		{	
			System.out.println("Division is : "+ans1);
		}
	}
}