package DS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class RottenOrange {
	int[] dr = new int[] { -1, 0, 1, 0 };
	int[] dc = new int[] { 0, -1, 0, 1 };

	public static void main(String s[]) {

		RottenOrange rottenOrange = new RottenOrange();
		int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		System.out.println(rottenOrange.orangesRotting(grid));

	}

	public int orangesRotting(int[][] grid) {
		int R = grid.length, C = grid[0].length;

		Queue<Integer> queue = new LinkedList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				if (grid[r][c] == 2) {
					int code = r * C + c;
					queue.add(code);
					map.put(code, 0);
				}

		int ans = 0;
		while (!queue.isEmpty()) {
			int code = queue.remove();
			int r = code / C, c = code % C;

			for (int k = 0; k < 4; ++k) {
				int nr = r + dr[k];
				int nc = c + dc[k];

				if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == 1) {
					grid[nr][nc] = 2;
					int ncode = nr * C + nc;
					queue.add(ncode);
					map.put(ncode, map.get(code) + 1);
					ans = map.get(ncode);
				}
				
			}
		}

		for (int[] row : grid)
			for (int v : row)
				if (v == 1)
					return -1;
		return ans;
	}

}
