package NetworksP4;
import java.util.*;
public class XOR
{
	
	public static String Crypt(String inputMessage, String codebook)
	{	
		byte [] messageBytes = inputMessage.getBytes();
		byte [] bookBytes = codebook.getBytes();
		byte [] result = new byte [messageBytes.length];
		for (int i = 0; i<=messageBytes.length-1; i++)
		{
		result [i]=(byte)(messageBytes[i]^bookBytes[i]);
		}
		return new String(result);
		
	}
	public static void main (String [] args)
	{
		String codebook;
		String inputMessage;
		
		System.out.println("Please enter a message: ");
		Scanner message = new Scanner(System.in);
		inputMessage = message.nextLine();
		
		System.out.println("Please enter the codebook: ");
		Scanner cb = new Scanner(System.in);
		codebook = cb.nextLine();

		String result = Crypt(inputMessage, codebook);
		System.out.println(result);
		result = Crypt(result, codebook);
		System.out.println(result);
		
	}
}
