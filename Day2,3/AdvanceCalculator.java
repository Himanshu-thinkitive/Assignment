

public class AdvanceCalculator extends Calculator{
	int ans=1;
	int f;
	
	public int fact(int f)
	{
		//this.f=f;
	for(int i=f;f>0;f++)
	{
		ans=ans*f;
	}
	return ans;
	}
	
	public int div(int a,int b)
	{
		System.out.println(super.div(a,b));
		//can replace the upper line with below two lines
		//Calculator t=new Calculator();
		//System.out.println(t.div(a, b));
		return a%b;
		//return null;
	}

}
