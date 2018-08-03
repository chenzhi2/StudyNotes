public class Node{
	int value;
	Node leftChild;
	Node rightChild;
	public Node(int value){
		this.value=value;
	}
	public void dispaly(){
		System.out.println(this.value+"\t");
	}
	public String toString(){
		return String.valueOf(value);
	}
}
public class BinaryTree{
	private Node root=null;
	public BinaryTree(value){
		root=new Node(value);
		root.leftChild=null;
		root.rightChild=null;
	}
	//
	public Node findKey(int value){
		Node current=root;
		if(value==current.value) return current;
		else if(value<current.value) current=current.leftChild;
		else if(value>current.value) current=current.rightChild;
		if(current==null) return null;
	}
	//
	public boolean delete(int value){
		
	}
	//
	public String insert(int value){
		Node node=new Node(value);
		if(root==null){
			root=node;
			root.leftChild=null;
			root.rightChild=null;
		}
		else{
			Node current=root;
			Node parent=null;
			if(value<current.value){
				parent=current;
				current=current.leftChild;
				if(current==null){
					parent.leftChild=node;
					break;
				}
			}
			else if(value>current.value){
				parent=current;
				current=current.rightChild;
				if(current=null){
					parent.rightChild=node;
					break;
				}
			}
		}
	}
	//
	public void inOrderTraverse(Node node){
		if(node==null) return;
		inOrderTraverse(node.leftChild);
		node.display();
		inOrderTraverse(node.rightChild);
	}
	//
	public void preOrderTraverse(){
		
	}
	//
	public void postOrderTraverse(){
		
	}
}