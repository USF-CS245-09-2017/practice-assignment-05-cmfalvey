
public class BSTree{

	public BSTreeNode head = new BSTreeNode();
	
	public void insert(String s) {
		BSTreeNode test = new BSTreeNode(s);
		
		if(head.data == null){
			head = test;
			return;
		}
		
		BSTreeNode current = head;
		BSTreeNode parent = null;
		
		while (true){
			parent = current;
			
			if(s.compareTo(current.data) > 0){				
				current = current.left;
				if(current==null){
					parent.left = test;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = test;
					return;
				}
			}
		}
	}
	
	public boolean find(String s) {
		BSTreeNode test = head;
		while (test.left != null && test.right != null) {
			if (test.data == s) {
				return true;
			} else if (s.compareTo(test.data) > 0) {
				test = test.left;
			} else {
				test = test.right;
			}
		}
		return false;
	}
	
	public void delete(String s) {
		BSTreeNode test = head;
		if (head.data != null) {
			delete(s, test);
		}
	}
	
	public void delete(String s, BSTreeNode node) {
		
	}
	
	public String toStringInOrder() {
		
		return "";
	}
	
	public String toStringPreOrder() {
		
		return "";
	}
}
