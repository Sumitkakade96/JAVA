import java.util.*;
import java.io.*;

class assign503
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
			FileWriter fr = new FileWriter(fd,true);
			
			BufferedWriter br2 = new BufferedWriter(fr);
			
			System.out.println("Enter data at the end of file");
			String data1=sobj.nextLine();
			br2.write(data1);
			br2.flush();
			br2.close();
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}