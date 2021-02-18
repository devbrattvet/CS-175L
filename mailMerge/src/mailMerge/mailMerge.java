
package mailMerge;
import java.util.Scanner;
public class mailMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String promptText1="Please enter your first name: ";
		String promptText2="PLease enter your last name: ";
		String promptText3="Please enter your house number: ";
		String promptText4="Please enter your street: ";
		String promptText5="Is this address correct? ";
		String replaceText1="Dear, <firstName> <lastName>,";
		String replaceText2="Please confirm that your address is <houseNumber> <street>.";
		String replaceText3="Your answer is: <yORn> Goodbye!";
		System.out.println(promptText1);
		String firstName=in.nextLine();
		System.out.println(promptText2);
		String lastName=in.nextLine();
		System.out.println(promptText3);
		String streetNumber=in.nextLine();
		System.out.println(promptText4);
		String streetName=in.nextLine();
		replaceText1=replaceText1.replace("<firstName>",firstName).replace("<lastName>", lastName);
		System.out.println(replaceText1);
		replaceText2=replaceText2.replace("<houseNumber>",streetNumber).replace("<street>",streetName);
		System.out.println(replaceText2);
		System.out.print(promptText5);
		String yorno=in.nextLine();
		replaceText3=replaceText3.replace("<yORn>",yorno);
		System.out.println(replaceText3);
		
		in.close();
		
	}

}
