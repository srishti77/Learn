package oca;

interface Motor{
	
}

abstract class Car{
	protected int size = 5;
	static {
		System.out.println("1");
	}
	
	Car(String name){
		System.out.println("2");
	}
	
	{
		System.out.println("3");
	}
	
	//abstract String getCar();
	
}

abstract public class BlueCar extends Car implements Motor {
	{
		System.out.println("4");
	}
	
	BlueCar(){
		super("blue");
		System.out.println("5");
	}
	
	Car getCar() {
		System.out.println("Blue Car");
		return null;
	}
	
	public static void main(String s[]) {
		//new BlueCar();
		
		System.out.println("Hellos");
	}
	
}
