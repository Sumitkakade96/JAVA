import java.util.*;
import java.io.*;
import java.security.*;

class assign509
{
	public static String checksum(String filepath,MessageDigest md)
	{
		try
		{
			DigestInputStream dis = new DigestInputStream(new FileInputStream(filepath),md);
			while(dis.read()!= -1);
			md = dis.getMessageDigest();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		StringBuilder result = new StringBuilder();
			for(byte b : md.digest())
			{
				result.append(String.format("%02x",b));
			}
			return result.toString();
	}
	public static void main(String arg[])
	{
		try
		{
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			System.out.println("Enter the file name: ");
			String fname = br.readLine();
			
			String hex = checksum(fname,md);
			System.out.println(hex);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}