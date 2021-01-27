


	public class MarketingExecutive extends Employ
	{
		
			double tourallowance, phonecallallowance=1500;
			int travel_km;
			
			public MarketingExecutive(int empid, String ename, double basicSalary, double medical,int travel_km)
			{
				super(empid,ename, basicSalary,medical);
				 this.travel_km=travel_km;
				this.tourallowance= 5 * travel_km;
				
			}
			public MarketingExecutive()
			{
				
			}
			
			public double calculateGrossSalary() {
				this.grossSalary = tourallowance + phonecallallowance + super.calculateGrossSalary();
				return this.grossSalary;
			}
		
	}