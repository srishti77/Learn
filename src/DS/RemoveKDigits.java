package DS;

public class RemoveKDigits {
	int smallest = Integer.MAX_VALUE;
	public static void main(String s[]) {
		String str = "10";
		int k=2;
		RemoveKDigits removeKDigits = new RemoveKDigits();
		int rem = str.length()-k;
		if(rem == 0)
			System.out.println("0");
		else {
			removeKDigits.showString(str, "", 0, rem);
			System.out.println("The strsing is: "+ removeKDigits.smallest);
		}
		
	}
	
	public void showString(String str, String newStr, int index, int k) {
		
		for( int i = index; i < str.length(); i++) {
			String s = newStr + str.charAt(i);
			if(s.length() == k) {
				System.out.println(s);
				smallest = Math.min(smallest, Integer.parseInt(s));
			}
			else {
				 showString(str, s, i+1, k);
			}
			
		}
	}
}
