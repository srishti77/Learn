package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import DS.MatrixSpiral;

public class TestSpiralMatrix {

	@Test
	public void testSingleRowSpiralMatrix() {
		int input[][] = {{1}};
		int expected[] = new int[1];
		expected[0] = 1;
		int actual[] = MatrixSpiral.spiralCopy(input);
		assertArrayEquals(expected, actual);
	}
}
