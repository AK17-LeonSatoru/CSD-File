/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dll01;

/**
 *
 * @author Admin
 */
public class MyDLL {
    private MyNode head;
    private MyNode tail;

    public MyDLL() {
        head = null;
        tail = null;
        MyNode n = new MyNode (5);
    }

    public MyDLL(MyNode head, MyNode tail) {
        this.head = head;
        this.tail = tail;
    }

    public MyNode getHead() {
        return head;
    }

    public void setHead(MyNode head) {
        this.head = head;
    }

    public MyNode getTail() {
        return tail;
    }

    public void setTail(MyNode tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "MyDLL{" + "head=" + head + ", tail=" + tail + '}';
    }
    
    //Thêm Node Head
    public void addHead(int x){
        MyNode newNode = new MyNode(x);
        if (head == null && tail == null) {
            head= newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }    
    }
    
    //Thêm node Tail
    public void addTail(int x) {
        MyNode newNode = new MyNode (x);
         if (head == null && tail == null) {
            head= newNode;
            tail = newNode;
        } else
         {
             tail.setNext(newNode);
             newNode.setPrev(tail);
             tail = newNode;
         }
    }
    

    //Remove node where head point to
    public void removeHead(){
        if (head == null && tail == null){
            System.out.println("List is empty!");
        }
        else if (head == tail) {
           head = null;
           tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    }
    
    //Remove node at tail
    public void removeTail(){
       if (head == null && tail == null){
            System.out.println("List is empty!");
        }
        else if (head == tail) {
           head = null;
           tail = null;
        } else{
            //tail.setPrev(tail);
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }
    
    //IN RA KẾT QUẢ
        public void Traversal(){
         if (head == null && tail == null){
            System.out.println("List is empty!");
        }
        else {
            MyNode curr = head;
            while ( curr != null){
                System.out.println(curr.toString());
                curr = curr.getNext();
            }
        }
    }
    
}

