package DS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CourseSchedule {
	
	public static void main(String s[]) {
		
		CourseSchedule course = new CourseSchedule();
		int numCourse =2;
		int[][] dependency = {{0,0},{1,0}};
		System.out.println();
		
	}
	
	public static boolean canFinish1(int numCourses, int[][] prerequisites) {
		
		if (numCourses <= 0)
			return false;
		
		Queue<Integer> queue = new LinkedList<>();
		int[] inDegree = new int[numCourses];
		
		for (int i = 0; i < prerequisites.length; i++) {
			inDegree[prerequisites[i][1]]++;
		}
		
		for (int i = 0; i < inDegree.length; i++) {
			if (inDegree[i] == 0)
				queue.offer(i);
		}
		
		while (!queue.isEmpty()) {
			int x = queue.poll();
			
			for (int i = 0; i < prerequisites.length; i++) {
				if (x == prerequisites[i][0]) {
					inDegree[prerequisites[i][1]]--;
					if (inDegree[prerequisites[i][1]] == 0)
						queue.offer(prerequisites[i][1]);
				}
			}
		}
		
		for (int i = 0; i < inDegree.length; i++) {
			if (inDegree[i] != 0)
				return false;
		}
		
		return true;
	}
}
