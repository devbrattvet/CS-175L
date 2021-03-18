package roachPopulation;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class roachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startingPop;
		double sprayPer;
		DecimalFormat decFormat=new DecimalFormat("00");
		String in= JOptionPane.showInoutDialog(null, "Please enter the starting roach population: ");
		startingPop=Double.parseDouble(in);
		roachPopulation bugs=new roachPopulation(startingPop);
		JOptionPane.showMessageDialog(null, "The initial roach population is "+decFormat.format(Math.round(bugs.getRoaches())));
		
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 1 breeding is "+decFormat.format(Math.round(bugs.getRoaches())));
		in=JOptionPane.showInputDialog("Please enter spray percentage for cycle 1 ");
		sprayPer=Double.parseDouble(in);
		bugs.spray(sprayPer);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 1 is "+decFormat.format(sprayPer+100)+"% spraying is "+Math.round(bugs.getRoaches()));
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 2 breeding is "+decFormat.format(Math.round(bugs.getRoaches())));
		in=JOptionPane.showInputDialog("Please enter spray percentage for cycle 2 ");
		sprayPer=Double.parseDouble(in);
		bugs.spray(sprayPer);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 2 is "+decFormat.format(sprayPer+100)+"% spraying is "+Math.round(bugs.getRoaches()));
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 3 breeding is "+decFormat.format(Math.round(bugs.getRoaches())));
		in=JOptionPane.showInputDialog("Please enter spray percentage for cycle 3 ");
		sprayPer=Double.parseDouble(in);
		bugs.spray(sprayPer);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 3 is "+decFormat.format(sprayPer+100)+"% spraying is "+Math.round(bugs.getRoaches()));
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 4 breeding is "+decFormat.format(Math.round(bugs.getRoaches())));
		in=JOptionPane.showInputDialog("Please enter spray percentage for cycle 4 ");
		sprayPer=Double.parseDouble(in);
		bugs.spray(sprayPer);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 4 is "+decFormat.format(sprayPer+100)+"% spraying is "+Math.round(bugs.getRoaches()));
		
		
	}
	

}
