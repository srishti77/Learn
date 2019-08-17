package DS;

public class ShortestPalindrome {
	
	public static void main(String s[]) {
		
		String str = "aabcea";
		
		ShortestPalindrome palindrome = new ShortestPalindrome();
		System.out.println(palindrome.shortestPalindrome(str));
	}
	
	
	public String shortestPalindrome(String s) {
		
		StringBuilder revStr = reverseString(s);
		StringBuilder sb = new StringBuilder(s);
		
		int k=0;
		int length= revStr.length();
		
		if(length%2 != 0)
			length=length-1;
		
		
		
		for(int i=0; i<length; i++) {
			
			if(revStr.charAt(i) != sb.charAt(k)) {
				sb.insert(k, revStr.charAt(i));
			}
			k++;
		}
		
		return sb.toString();
		
	}


	private StringBuilder reverseString(String s) {
		// TODO Auto-generated method stub
		StringBuilder newString = new StringBuilder();
		
		for(int i=s.length() -1; i>=0; i--) {
			
			newString.append(s.charAt(i));
		}
		return newString;
	}
	
	
	
}
