package oca;

import java.io.FileNotFoundException;
import java.io.IOException;

interface Horn { 
	public Number play();
}

abstract class Woodwind{
	
	public Long play() {
		return 3L;
	}
}

public final class Saxophone{
	
	public void openBridge() throws RuntimeException{
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("Opening...");
		}
		finally {
			System.out.println("Walls---");
		}
	}
	public static void main(String[] moat) {
		try {
			System.out.println(1);
		}
		
		finally {
			System.out.println(4);
		}
		
		System.out.println(5);
		new Saxophone().openBridge();
	}

}
