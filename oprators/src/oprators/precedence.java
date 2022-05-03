package oprators;

public class precedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//operator precedence
		 
		int a=9,b=3,c=5;
		
		System.out.println(a*b+c);//32
		System.out.println(a*(b+c));//72
		System.out.println(5*6+10/2-8%3);//33
		
		int d=5*6+10/2-8%3;
		System.out.println(d);//33
		
		System.out.println(10>5 && !(5>6)); //true

		System.out.println(3433>433&&!(343>554));//true
		
		
		
		
		
		
		
	}

}
