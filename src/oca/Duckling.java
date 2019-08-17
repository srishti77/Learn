package oca;

 class Duck{
	protected int count;
	 int getDuckies() {
		 return 0;
	 }
}
public class Duckling extends Duck {
	
	private int age;
	public Duckling(int age) {
		this.age = age;
	}
	@Override
	int getDuckies() {
		// TODO Auto-generated method stub
		return age/count;
	}
	
	public static void main(String s[]) {
		Duck duck = new Duckling(5);
		System.out.println(duck.getDuckies());
	}
}
