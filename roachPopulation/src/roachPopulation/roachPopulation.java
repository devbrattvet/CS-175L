package roachPopulation;

public class roachPopulation {

	
		private double roachPopulation;
		{
			roachPopulation=startingPop;
			
		}
		public void breed()
		{
			roachPopulation=roachPopulation*2;
		}
		public void spray(double sprayPer)
		{
			roachPopulation=roachPopulation-(roachPopulation*sprayPer);
		}
		public double getRoaches()
		{
			return roachPopulation;
		}
}
