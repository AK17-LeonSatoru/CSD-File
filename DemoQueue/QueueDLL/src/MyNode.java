/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class MyNode {
    private int data;
    private MyNode prev;
    private MyNode next;

    public MyNode() {
        data = 0;
        next = null;
        prev = null;
    }

    public MyNode(int data, MyNode prev, MyNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

        public MyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
        }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyNode getPrev() {
        return prev;
    }

    public void setPrev(MyNode prev) {
        this.prev = prev;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "data=" + data ;
    }
    
    
}
