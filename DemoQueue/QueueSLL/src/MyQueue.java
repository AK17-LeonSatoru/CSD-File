/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class MyQueue {
    private MyNode head;
    private MyNode tail;

    public MyQueue() {
        head = null;
        tail = null;
    }

    public MyQueue(MyNode head, MyNode tail) {
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

    
    public void enqueue (int x){
        MyNode newNode = new MyNode (x, null);
       if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
            
        }
    }
    
    //Hiển thị giá trị các phần tử trong danh sách
     public void traversal (){
        if (head == null && tail == null){
            System.out.println("List is empty!");
        }
        else {
            MyNode current = head;
            while ( current != null){
                System.out.println(current.toString());
                current = current.getNext();
         }
        }
    }
     
    // Xóa node ra đầu danh sách
    public MyNode dequeue(){
        
        MyNode ret = null;
        if (head == null && tail == null) {
            System.out.println("List is empty");
            return ret;
        }
        else { 
            ret = head;
            if (head != tail){
                head = head.getNext();
                return ret;
            }
            else {
                ret = head; 
                head = null;
                tail = null;
                return ret;
            }
        }
    }
}
