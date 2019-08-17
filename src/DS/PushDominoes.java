package DS;

public class PushDominoes {

	public static void main(String s[]) {
		
		PushDominoes domino = new PushDominoes();
		System.out.println(domino.pushDominoes("RR.L"));
		
	}

	public String pushDominoes(String dominoes) {

		char array[] = dominoes.toCharArray();

		for (int i = 0; i < array.length; i++) {

			if(dominoes.charAt(i) == '.' && i==0 && (i+1)<array.length) {
				if(dominoes.charAt(i+1) == 'L')
					array[i] = 'L';
			}
		
			else if(dominoes.charAt(i) == '.' && i==array.length-1 && (i-1)> 0) {
				if(dominoes.charAt(i-1) == 'R') {
					array[i] = 'R';
					
				}
					
			}
			
			else if((i-1) >=0 && (i+1)< array.length && dominoes.charAt(i) == '.'){
				if((dominoes.charAt(i-1) == 'R' && dominoes.charAt(i+1) == 'L' ))
					array[i] = '.';
				else if(dominoes.charAt(i-1)  == 'R' ) {
					array[i] = 'R';
				
				}
					
				
				else if(dominoes.charAt(i+1)  == 'L' ) 
					array[i] = 'L';
			}
			
		}
		return new String(array);
	
	}
		
}
