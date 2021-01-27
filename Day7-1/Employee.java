import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable  {
	
	private int empid;
	 private String ename;
	transient private int sal;
	int add;
	Employee e=null;
	public Employee()
	{
		
	}
	
	
	public Employee(int empid, String ename, int sal, int add,Object O) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.add = add;
		Employee e=(Employee) O;
	}


	public Employee(int empid, String ename, int sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	 
	public void doSerialization()
	{
		try {
			FileOutputStream fr=new FileOutputStream("serial.txt");
			ObjectOutputStream os=new ObjectOutputStream(fr);
			os.writeObject(this);
			
			//fr.close();
			os.close();
			fr.close();
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + sal;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (sal != other.sal)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public Employee doDeSerialization()
	{
		Employee em=null;
	    try {
			FileInputStream fr=new FileInputStream("serial.txt");
			ObjectInputStream os=new ObjectInputStream(fr);
			
			
			
			 em=(Employee) os.readObject(); 
			
			os.close();
			fr.close();
		} 
	    catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return em;
	}
	

}


