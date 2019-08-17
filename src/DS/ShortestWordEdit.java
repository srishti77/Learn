package DS;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestWordEdit {
	
	public static void main(String s[]) {
	
		String str[] = {"abc", "ab"};
		String source = "abc", target = "ab";
		ShortestWordEdit shortWords = new ShortestWordEdit();
		System.out.println(shortWords.countSteps(str, source, target));
	}

	private int countSteps(String[] str, String source, String target) {
		
		int count = 0;
		Queue<CurrentPathCount> queue = new LinkedList<CurrentPathCount>();
		int length  = str.length;
		boolean[] visited = new boolean[length];
	
		queue.add(new CurrentPathCount(source, 0));
		
		while(!queue.isEmpty()) {
			CurrentPathCount currentPath = queue.remove();
			String current = currentPath.getWord();
			int path = currentPath.getPath();
			System.out.println("current: " + current);
			if(current.equals(target)) {
				count = path;
				return count;
			}
				
			for( int i = 0; i < length; i++) {
				if(!visited[i] && findDifference(current, str[i]) == 1) {
					queue.add(new CurrentPathCount(str[i], path + 1));
					visited[i] = true;
				}
			}	
		}
		return -1;
		
	}
	
	class CurrentPathCount {
		String word;
		int path;
		
		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public int getPath() {
			return path;
		}

		public void setPath(int path) {
			this.path = path;
		}

		CurrentPathCount(String word, int path){
			this.word = word;
			this.path = path;
		}
	}
	
	public static int findDifference(String first, String second) {
		
		int count = 0;
		int i = 0;
		for( i = 0; i < first.length() && i < second.length(); i++) {
			if(first.charAt(i) != second.charAt(i)) {
				count++;
			}
		}
		
		while(i < first.length()) {
			count ++;
			i++;
		}
			
		while(i < second.length()) {
			count++;
			i++;
		}

		return count;
	}
	
	
}
