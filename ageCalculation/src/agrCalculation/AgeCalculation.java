package agrCalculation;
import java.swing.JOptionPane;
public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String birthday = JOptionPane.showInputDialog(null, "Enter your birthday (MM/DD/YYYY): ");
		
		String subYear= birthday.substring(6,10);
		String subDay = birthday.substring(3,5);
		String subMonth = birthday.substring(0,2);
		
		String todaysDate = JOptionPane.showInputDialog(null, "Enter today's date (MM/DD/YYYY): ");
		
		String subYearToday = todaysDate.substring(6,10);
		String subDayToday = todaysDate.substring(3,5);
		String subMonthToday = todaysDate.substring(0,2);
		
		
		int intYearBirthday = Integer.parseInt(subYear);
		int intMonthBirthday = Integer.parseInt(subMonth);
		int intDayBirthday = Integer.parseInt(subDay);
		
		int intYearTodayDate = Integer.parseInt(subYearToday);
		int intMonthTodayDate = Integer.parseInt(subMonthToday);
		int intDayTodayDate = Integer.parseInt(subDayToday);
		
		int systemYear = intYearTodayDate - intYearBirthday;
		int systemMonth = intMonthTodayDate - intMonthBirthday;
			
		if(intMonthTodayDate <= intMonthBirthday)
		{
			systemYear = systemYear - 1;
		}
		if(intDayTodayDate < intDayBirthday)
		{
			systemMonth = systemMonth - 1;
		}
	
		JOptionPane.showMessageDialog(null, "You are " + systemYear + " and " + systemMonth + " months old");
	}

}
