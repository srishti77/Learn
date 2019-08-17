package oca;

public class Coat {
	public Long zipper() throws Exception {
		try {
			String checkedZipper = (String) new Object();
			
		}
		catch(Exception e) {
			throw new RuntimeException("Broken");
		}
		return null;
	}
	
	public static void main(String s[]) {
		try {
			new Coat().zipper();
		}
		catch(Throwable t) {
			
		}
	}
}
