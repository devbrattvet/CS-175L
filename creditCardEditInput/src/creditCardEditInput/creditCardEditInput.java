package creditCardEditInput;
import java.util.Scanner;
public class creditCardEditInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a credit card number: ");
		String input=in.nextLine();
		int a=0;
		while(a<input.length())
		{
			char character=input.charAt(a);
			if(character == '-' || character == ' ')
			{
				String before = input.substring(0,a);
				String after = input.substring(a+1);
				input = before+after;
			}
			else
			{
				a++;
			}
		}
		System.out.println(input);
		in.close();
	}

}
