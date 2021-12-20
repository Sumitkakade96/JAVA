import java.util.*;
import java.io.*;

class assign506
{
	public static void main(String arg[])
	{
		String str1,str2,data;
		byte b[];
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the first file name: ");
			str1 = br.readLine();
			
			System.out.println("Enter the second file name: ");
			str2 = br.readLine();
			
			File fd1 = new File(str1);
			FileReader frd1 = new FileReader(fd1);
			
			File fd2 = new File(str2);
			FileWriter frw2 = new FileWriter(fd2);
			//System.out.println("First file open successfully");
			BufferedReader br1 =new BufferedReader(new FileReader(fd1));
			
			//FileOutputStream fout = new FileOutputStream(str2);
			//BufferedOutputStream brout = new BufferedOutputStream(fout);
			while((data =br1.readLine())!= null)
			{
				frw2.write(data);
			}
		
			frd1.close();
			frw2.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}