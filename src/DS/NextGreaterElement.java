package DS;

import java.util.Stack;

/*
 *
 * 4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
   
   Insert into the stack 
   Take current element as next
   Compare element of stack with the next element, if the top of stack is small, 
   continue popping element 
   until next < top
   
   push next into stack
 */
public class NextGreaterElement {
	static Stack<Integer> stack = new Stack();
	public static void main(String s[]) {
		
		int array[] = {13, 7, 6, 12};
		computeNGE(array);
	}
	
	public static void computeNGE(int[] array) {
		if(array.length ==0)
			return;
		stack.push(array[0]);
		
		for( int i = 1; i<array.length; i++) {
			
			int next = array[i];
			while(!stack.isEmpty() && stack.peek() < next) {
				System.out.println("Element"+ stack.pop() + " -> "+ next);
			}
			stack.push(next);
		}
		
		while(!stack.isEmpty()) {
			System.out.println("Element"+ stack.pop() + " -> -1");
		}
	}
	
}
