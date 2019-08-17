package oca;

abstract class Book{
	
	protected static String material = "papyrus";
	
	public Book() {
		
	}
	
	public Book(String material) {
		
	}
	
	public String getMaterial() {
		return material;
	}
	
}
public class Encyclopedia extends Book{
	
	public static String material = "cellulose";
	
	public Encyclopedia() {
		super();
	}
	
	public String getMaterial() {
		return super.material;
	}
	
	public static void main(final String s[]) {
		System.out.println(new Encyclopedia().getMaterial());
	}
}
