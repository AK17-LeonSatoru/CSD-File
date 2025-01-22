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
public class MyProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyDLL myList = new MyDLL();
        myList.removeHead();
        myList.removeTail();
        
        myList.addHead(5);
        myList.addTail(0);
        
        myList.addHead(10);
        myList.addTail(15);
        
        myList.Traversal();
        
        myList.removeTail();
        myList.removeHead();
        myList.Traversal();
        
        myList.removeTail();
        myList.removeHead();
        myList.Traversal();
    }
    
}
