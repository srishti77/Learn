package DS;

import java.util.ArrayList;
import java.util.List;

/*
 * string = "123"; op: '+', '-', '*'
 */
public class AllPossibleStringOperator {
	
	static char operators[] = new char[3];
	public static void main(String s[]) {
		String str = "123";
		char[] strArray = str.toCharArray();
		operators[0] = '+';
		operators[1] = '-';
		operators[2] = '*';
		//allPossibleExp(strArray, 0, "");
		getExprUtil(new ArrayList<String>(), "", str, 6, 0, 0, 0);
	}
	
	public static void allPossibleExp(char[] array, int index, String currStr) {
		
		if(index == array.length-1) {
			System.out.println(currStr + array[index]);
			return;
		}
		currStr = currStr + array[index];
		for(int i = index+1; i < array.length-1; i++) {
			currStr = (currStr +"+ ");
			allPossibleExp(array, i+1, currStr);
		}		
	}
	
	
	public static void getExprUtil(List<String> res, String curExp, 
			String input, int target, int pos, int curVal, int last ) {
		
		if( pos == input.length()) {
			if(curVal == target) {
				res.add(curExp);
				System.out.println(curExp);
			}
				
			return;
		}
		
		for( int i = pos; i < input.length(); i++) {
			
			if( i != pos && input.charAt(pos) == '0') {
				break;
			}
			
			String part = input.substring(pos, i+1-pos);
			System.out.println(part);
			int curr = Integer.parseInt(part.toString().trim());
			
			if(pos == 0)
				getExprUtil(res, curExp+part, input, target, i + 1, curr, curr);
			
			else {
				getExprUtil(res, curExp + "+" + part, input, 
	                     target, i + 1, curVal + curr, curr); 
	            getExprUtil(res, curExp + "-" + part, input, 
	                     target, i + 1, curVal - curr, -curr); 
	            getExprUtil(res, curExp + "*" + part, input, 
	                     target, i + 1, curVal - last + last * curr, 
	                     last * curr); 
			}
		}
		
	}
	
	/* arr = 1, 2, 3
	 * i = 0...3
	 * 1 index = 1 need to go from 1 .. 3
	 * 1 2 index 2 need to go from 2 .. 3
	 * 1 2 3 index 3 need to go from 3 .. 3
	 * 	print 1 2 3
	 */
	
	
	/*
	 * arr = 1, 2, 3
	 * 
	 * seperate 1, 2 3
	 * 12 3
	 * 
	 */
}
