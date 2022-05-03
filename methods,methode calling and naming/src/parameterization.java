
public class parameterization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("inside main method");
		methodA(9); // single parameter method
		
		methodB();//no need to pass anything
		
		methodC(9,3.4,true,'s');
		
		
		
		
	}
	
	
	
	public static void methodA(int a){//single parameter method
		
		
		System.out.println("inside method having single parameter value:"+a);
		
	}
	
	public static  void methodB(){//no parameters
		
		System.out.println("inside method having no perametor");
		
		
	}
	
	public static void methodC(int a,double b,boolean c ,char d){//multiple parameter method
		
		System.out.println("inside method c having multiple parameter value: "+a+""+b+""+c+""+d);
		
		
	}

}
