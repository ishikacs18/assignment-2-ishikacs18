/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import problem3.myLinkedList.MyLinkedList;
import problem3.student.Student;
public class MyPriorityQueue {
	 MyLinkedList linkedList = new MyLinkedList();
	    public void enqueue(Student student){
	        linkedList.addLast(student);
	    }

	    public void dequeue(){
	        linkedList.deleteFirst();
	    }
	    public void show(){
	        linkedList.display();
    }
}
package problem3.myLinkedList;

import problem3.node.Node;
import problem3.student.Student;

public class MyLinkedList {
    private Node first;
    private Node last;

    public void addLast(Student student){
        Node node = new Node(student);
        if(first==null){
            first=last=node;
            return;
        }
        last.setNext(node);
        last=node;

        var current = first;
        while(current!=null){
            if(node.getData().getRollNo()<current.getData().getRollNo()) {
                var temp = node.getData();
                node.setData(current.getData());
                current.setData(temp);
            }
            current= current.getNext();
        }
    }

    public void deleteFirst(){
        if(first==null){
            first=last=null;
            return;
        }
        var second = first.getNext();
        first.setNext(null);
        first=second;
    }

    public void display(){
        var current = first;
        while(current!=null){
            System.out.println(current.getData());
            current=current.getNext();
        }
    }

}