package oca;

abstract class A{
	abstract Object methodA();
}

abstract class B extends A{
	abstract Object methodA(Object o);
}
abstract public class Ballroom extends B{
	protected abstract Object methodA();
	public static void main(String[] s) {
		System.out.println("Lets party");
	}
}
