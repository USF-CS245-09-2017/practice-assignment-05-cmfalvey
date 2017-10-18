
public class BSTreeNode {

	public BSTreeNode left;
	public BSTreeNode right;
	public String data;
	
	public BSTreeNode(String s) {
		data = s;
		left = null;
		right = null;
	}
	
	public BSTreeNode() {
		this(null);
	}
}
