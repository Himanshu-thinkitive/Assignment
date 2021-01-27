package Day5;

import Day5.Outer.Inner;

public class Demo extends Inner {

	public static void main(String[] args) {
		
		Outer o=new Outer();
		Inner i=new Inner();
		i.new1();
		o.new2();
		
		

	}

}
