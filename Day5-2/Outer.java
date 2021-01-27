package Day5;

 public class Outer {
	
	 private int a=19;
	 
	 public void new2()
	 {
		 System.out.println(this.a);
	 }
	 
	 static  class Inner
	 {   
		 private int a=10;
	      public void new1()
	      {
	    	  
	    	  System.out.println(this.a);
	    	  
	      }
	 }

}
