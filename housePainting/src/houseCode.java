import java.util.Scanner;
public class houseCode {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int length=0;
		int width=0;
		int height=0;
		int numberWindow=0;
		int lengthWindow=0;
		int widthWindow=0;
		int numberDoor=0;
		int lengthDoor=0;
		int widthDoor=0;
		int windowSqFt=0;
		int doorSqFt=0;
		int totalSqFtNoPeak=0;
		int totalSqFtPeak=0;
		int totalSqFt=0;
		double costPerSqFt=0;
		double costTotal=0;
		System.out.println("Please enter the cost per sqaure foot: ");
		costPerSqFt=in.nextInt();
		System.out.println("Please enter the length of the house: ");
		length=in.nextInt();
		System.out.println("Please enter the width of the house: ");
		width=in.nextInt();
		System.out.println("Please enter the height of the house: ");
		height=in.nextInt();
		System.out.println("Please enter the number of windows: ");
		numberWindow=in.nextInt();
		System.out.println("Please enter the length of a window: ");
		lengthWindow=in.nextInt();
		System.out.println("Please enter the width of a window: ");
		widthWindow=in.nextInt();
		System.out.println("Please enter the number of doors: ");
		numberDoor=in.nextInt();
		System.out.println("PLease enter the length of a door: ");
		lengthDoor=in.nextInt();
		System.out.println("Please enter the width of a door: ");
		widthDoor=in.nextInt();
		windowSqFt=widthWindow*lengthWindow;
		doorSqFt=widthDoor*lengthDoor;
		totalSqFtNoPeak=(length*width)*2;
		totalSqFtPeak=((length*width)+((length*(height-width))/2))*2;
		totalSqFt=((totalSqFtNoPeak+totalSqFtPeak)-((windowSqFt*numberWindow)+(doorSqFt*numberDoor)));
		costTotal=totalSqFt*costPerSqFt;
		System.out.println("Total paintable surface area is "+totalSqFt+" square feet.");
		System.out.println("Cost to paint the house is: "+costTotal+" dollars.");
		in.close();
		
	}
	

}
