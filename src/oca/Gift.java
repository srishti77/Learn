package oca;

public class Gift {
	private Object contents;
	private int size ;
	
	{
		final int height = 51;
	}
	Gift(int size){
		this.size = size;	
	}
	
	protected Object getContents() {
		return contents;
	}
	
	protected void setContents(Object contents) {
		this.contents = contents;
	}
	
	public void showPresent() {
		System.out.println("Your gift: "+contents);
		this.getNumber(null,7);
	}
	
	public static final void main(String s[]) {
		 Gift gift = new Gift(3);
		getNumber(gift,7);
		
		System.out.println(gift.size);
	}
	
	public final static int getNumber(Gift gift, int size) {
		gift = new Gift(size);
		gift.contents = null;
		return 10;
	}
	
	
}
