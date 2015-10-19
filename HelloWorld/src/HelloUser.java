import java.io.IOException;

public class HelloUser {
	
	private static String userName;
	
	public static void greetUser() {
		System.out.println("Hello ASE2015 - how are you? :)");
		byte[] eingabe = new byte[256];
		int bytesgelesen = 0;
		try
		{
			System.out.println("Please enter your name: ");
			bytesgelesen = System.in.read(eingabe);
		}
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
		if (bytesgelesen > 0)
		{
			userName = new String(eingabe,0,bytesgelesen-1);
			System.out.println("Hello " + userName + "!");
		}
	}
	
	public static void main(String[] args) {
		greetUser();
	}
}
