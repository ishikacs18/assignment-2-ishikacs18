/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

import problem3.student.Student;
public class Node {
	  private Student data;
	    private Node next;

	    public Node(Student data){
	        this.data=data;
	        this.next=null;
	    }

	    public Student getData() {
	        return data;
	    }

	    public void setData(Student data) {
	        this.data = data;
	    }

	    public Node getNext() {
	        return next;
	    }

	    public void setNext(Node next) {
	        this.next = next;
    }
}
package problem3.student;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String toString(){
        return getName()+" "+getRollNo();
    }
}









