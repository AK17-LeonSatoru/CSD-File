/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class MyQueueDLL {
    private MyNode head;
    private MyNode tail;

    public MyQueueDLL() {
        head = null;
        tail = null;
        MyNode n = new MyNode (5);
    }

    public MyQueueDLL(MyNode head, MyNode tail) {
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
    

    
    //Thêm node Tail
    public void enqueue(int x) {
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
    public MyNode dequeue(){
        MyNode ret = null;
        if (head == null && tail == null){
            System.out.println("List is empty!");
            return ret;
        }

        else if (head == tail) {
           ret = head;
           head = null;
           tail = null;
         return ret;
        } else {
                    ret = head;
            head = head.getNext();
            head.setPrev(null);
            return ret;            
        }
    }

    
}

