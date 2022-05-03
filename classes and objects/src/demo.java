
public class demo {

	public static void main(String[] args) {
	
		
		Car maruti= new Car();
		Car benz= new Car();
		Car audi= new Car();
		
		
		maruti.carModel="swift";
		maruti.carCost=8000000;
		maruti.carColor="blue";
		
		maruti.startCar();
		maruti.stopCar();
		maruti.carDetails();
		
		
		
		benz.carModel="a class";
		benz.carCost= 3000099;	
		benz.carColor="black";
		benz.startCar();
		benz.stopCar();
		benz.carDetails();
		
	    audi.carModel="b class";
	    audi.carCost=333333333;
	    audi.carColor="red";
		audi.startCar();
		audi.stopCar();
		audi.carDetails();
	}
	
	
}

 class Car{
	
  
	 String carModel;
	 int carCost;
	 String carColor;
	 
public void startCar() {
		 
		 System.out.println(carModel+" started");
		 
	 }
public void stopCar() {
		
		System.out.println(carCost+"stopped");
		
	}
public void carDetails() {
		
		System.out.println("the model of the car is:" +carModel);
		System.out.println("the cost of the car is:"+carCost);
		System.out.println("the color of the car is :"+carColor);
		System.out.println("----------------------------------------");
		
	}
	
}