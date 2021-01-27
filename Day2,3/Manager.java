

public class Manager extends Employ {
   

  private  double	foodAllowance;
   private double  managerAllowance;
   private  double otherAllowance;
   private double managersalary; 
   
   public Manager(int id,String name,int basicSalary,int medical)
   {
	   super(id,name,basicSalary,medical);
	   this.managerAllowance=0.1 * super.getBasicSalary();
	   this.foodAllowance=0.08 * super.getBasicSalary();
	   this.otherAllowance= 0.03 * super.getBasicSalary();
	   
	   
   }
   public Manager()
   {
	   
   }
   
  
    /* public double calculateManagerSalary()
    {
    	managerSalary= foodAllowance + managerAllowance + otherAllowance + super.basicSalary;
    	return managerSalary;
    } */
   
   public double calculateGrossSalary() 
   {
		this.managersalary= super.calculateGrossSalary() + foodAllowance + managerAllowance + otherAllowance;
		return this.managersalary;
	}
   

   
   
   
   

}
