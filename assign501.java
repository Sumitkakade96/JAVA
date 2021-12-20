import java.util.*;
import java.io.*;

class assign501
{
	public static void main(String arg[])
	{
		System.out.println("enter the file name");
		Scanner sobj = new Scanner(System.in);
		String str = sobj.nextLine();
		
		try
		{
			File fd =  new File(str);
			String data;
			//FileReader fd = new FileReader(str);
			BufferedReader br =new BufferedReader(new FileReader(fd));
			System.out.println("File is open");
			while((data=br.readLine())!=null)
			{
				System.out.println(data);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}