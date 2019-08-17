package DS;

public class ReadNCharGivenRead4 {
	
	String str = "abcdefghijk";
	int index =0;
	char[] buf = new char[4];
	
	public static void main(String s[]) {
		
		ReadNCharGivenRead4 charGiven = new ReadNCharGivenRead4();
		char[] buffer = new char[11];
		charGiven.read(buffer, 1);
		charGiven.read(buffer, 2);
		
	}
	
	public int read4(char[] buf) {
		int i=0;
		for(int j=index; j<index+4 && j < str.length(); j++) {
			buf[i] = str.charAt(j);
			i++;
		}
		index +=i;
		return i;
	}
	
	public void read(char[] buffer, int n) {
		int count =0;
		int k=n;
		label: while(true) {
			int number = read4(buf);
			//System.out.println("Number is:" +number);
			for(int i=0; i<number; i++) {
				if(n >0) {
					buffer[count++] = buf[i];
					n--;
				}
				if(n ==0)
					break label;
			}
			
			if(number <4)
				break;	
		}
		
		for(int i=0; i<k; i++)
			System.out.println(buffer[i]);
		
	}
}
