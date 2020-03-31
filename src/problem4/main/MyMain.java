/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
import problem4.binaryST.MyBinarySearchTree;
	import problem4.myqueue.MyQueue;
	package problem4.binaryST;

	import problem1.node.TreeNode;


// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
	import problem4.binaryST.MyBinarySearchTree;
	import problem4.myqueue.MyQueue;
	public class MyMain {
	    public static void main(String[] args) {
	        MyQueue myQueue = new MyQueue();
	        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree(myQueue);
	        myBinarySearchTree.insert(10);
	        myBinarySearchTree.insert(20);
	        myBinarySearchTree.insert(3);
	        myBinarySearchTree.insert(30);
	        myBinarySearchTree.insert(15);
	        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());
	        System.out.println("PreOrder successors of all the nodes");
	        myQueue.show();

	    }
}


// to implement BinarySearchTree
public class MyBinarySearchTree {
    private MyQueue myQueue;

    public MyBinarySearchTree(MyQueue queue){
        this.myQueue = queue;
    }


    private TreeNode root;
    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if(root==null){
            root=node;
        }
        else{
            TreeNode current=root;
            TreeNode parent = null;
            while(current!=null){
                parent=current;
                if(node.getData()<current.getData()){
                    current=current.getLeft();
                }
                else{
                    current=current.getRight();
                }
            }
            if(node.getData()<parent.getData()){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void preOrder(TreeNode temp){
        if(temp==null){
            return;
        }
        else{
            myQueue.enqueue(temp.getData());
            preOrder(temp.getLeft());
            preOrder(temp.getRight());
        }
    }

    public void inOrder(TreeNode temp){
        if(temp==null){
            return;
        }
        else{

            inOrder(temp.getLeft());
            System.out.println(temp.getData());
            inOrder(temp.getRight());
        }
    }
}
