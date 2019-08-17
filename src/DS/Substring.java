package DS;

public class Substring {
	public static void main(String s[]) {
		
		String mainString = "ababcdefg";
		String checkString = "bcd";
		
		Substring sub = new Substring();
		System.out.println(sub.findSubstring(mainString, checkString));
		
	}
	
	public boolean findSubstring(String s1, String s2) {
		
		if(s1.length() < s2.length())
			return false;
		
		else if(s1.length() == s2.length()) {
			return s1.equals(s2);
		}
		
		
	return findSubstring(s1.substring(1), s2) || findSubstring(s1.substring(0, s1.length()-1), s2);
	
	}
}
