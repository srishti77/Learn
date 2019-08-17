package oca;

class Sphere{
	  String getName() {
		return "Sphere";
	}
}

class Planet{
	 String getName() {
		 return "";
	 }
}

public class Mars extends Sphere{

	public String getName() {
		return "Mars";
	}
	
	public static void main(final String[] probe) {
		System.out.println(((Mars) new Sphere()).getName());
	}
}
