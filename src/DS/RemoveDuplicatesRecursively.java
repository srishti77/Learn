package DS;

public class RemoveDuplicatesRecursively {
	public static void main(String s[]) {
		String str = "aaabbaa";
		removeDup(str,' ',0);
	}
	
	public static void removeDup(String s, char prev, int index) {
		
		if(index == s.length()) {
			System.out.println(s);
			return;
		}
			
		if(s.charAt(index) == prev) {
			s = s.substring(0, index)+s.substring(index+1);
			removeDup(s, prev, index);
		}
		else {
			removeDup(s, s.charAt(index), index+1);
		}	
	}
}
