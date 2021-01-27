
import java.util.ArrayList;
import java.util.List; 
public class Employ {

	 int empid;
	 int sookhiSalary;
	 private String ename;
	  double basicSalary,PF,PT,HRA,medical,grossSalary,netSalary;

			public Employ(int empid, String ename, double basicSalary, double medical) {
				this.empid=empid;
				this.ename = ename;
				this.basicSalary = basicSalary;
				this.medical = medical;
				this.HRA = 0.5 * basicSalary;
				this.PF = 0.12 * basicSalary;
				this.PT = 200;
			}

			public Employ()
			{
				
				
			}
			ArrayList l=new ArrayList();

			
			
			public double getBasicSalary() {
				return basicSalary;
			}
			
			
			public double calculateGrossSalary() {
				this.grossSalary = this.basicSalary + this.HRA + this.medical;
				return this.grossSalary;
			}

			public double calculateNetSalary() {
				this.netSalary = this.calculateGrossSalary() - this.PF - this.PT;
				return this.netSalary;
			}

			public void printEmploy() {
				System.out.println("Empid: " + this.empid);
				System.out.println("EName:" + this.ename);
				System.out.println("Gross:" + this.calculateGrossSalary());
				System.out.println("Net: " + this.calculateNetSalary());
				System.out.println("");
			}
			
			
			

			

			@Override
			public String toString() {
				return "Employ [empid=" + empid + ", ename=" + ename + ", basicSalary=" + basicSalary + "]";
			}
			
			public int compareTo(Employ e) {
				// TODO Auto-generated method stub
	 
				if(this.empid > e.empid)
				{
					return 1;
				}
				else if(this.empid < e.empid)
				{
					return -1;
				}
				else 
				
				return 0;
				
			}

			

			

		}
		
	
    