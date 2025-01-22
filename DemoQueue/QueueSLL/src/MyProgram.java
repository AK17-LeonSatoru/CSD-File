/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class MyProgram {

    public static void main(String[] args) {
        MyQueue myList = new MyQueue();
        myList.dequeue();
        myList.enqueue(20);
        myList.enqueue(15);
        myList.enqueue(0);
        myList.enqueue(5);      
        myList.enqueue(10);        
        
        System.out.println(myList.dequeue());
        System.out.println(myList.dequeue());
        System.out.println(myList.dequeue());
    }
    
}
