package oca;

class Forest{
	public long treeCount;
	public Forest(long treeCount) {
		this.treeCount = treeCount + 2; 
	}
}
public class RainForest extends Forest {
	public RainForest(long treeCount) {
		super(treeCount);
		this.treeCount = treeCount +1 ;
	}
	
	public static void main(String s[]) {
		System.out.println(new RainForest(5).treeCount);
	}
}
