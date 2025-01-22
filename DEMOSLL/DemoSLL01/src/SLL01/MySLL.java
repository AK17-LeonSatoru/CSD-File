package SLL01;


import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MySLL {
    private MyNode head;
    
    public MySLL () {
    head = null;
    //node ban đầu đang bị null 
    // Yêu cầu thêm phần tử vào  -> Đưa cái head chỏ vô địa chỉ cần được đưa vào
}
    public MySLL (MyNode head) {
        this.head = head;
    }

    public void setHead(MyNode head) {
        this.head = head;
    }

    public MyNode getHead() {
        return head;
    }
    
    //Adding new node in head of list
    public void addHead (int x) {
        MyNode newItem = new MyNode (x);
        if (head ==null) {
            head = newItem;
        }
        else{
            newItem.setNext(head);
            head = newItem;
        }
    }
   
    //Remove node where head point to
    public void removeHead(){
        if (head == null){
            System.out.println("List is empty!");
        }
        else {
            head = head.getNext();
        }
    }
    
    //Traveral: Duyệt qua các phần tử (Dùng để xuất ra các số hiện trên node)
    public void display (){
        if (head == null){
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
    
    //  Viết phương thức isEmpty(): boolean. Kiểm tra danh sách rồng
    public boolean isEmpty() {
        return head == null;
    }
    //  Viết phương thức isExists(int x): boolean. Kiểm tra trong danh sách có chứa giá tri x ?
    public boolean isExists (int x){
        MyNode current = head;
        while ( current != null){
            if (current.getData() == x) {
                return true;
            }
            current = current.getNext();            
                
        }
        return false;
    }
    //  Tim vị trí đầu tiên xuất hiện giá trị x trong danh sách, nêu không có thi trả vé -1
    
    public int findValue (int x){
        MyNode current = head;
        int position = 0;
        while (current != null){
            if (current.getData() == x){
                return position;
            }
            current = current.getNext();
            position ++;
        }
        return -1;
    } 
    
    // Tính giá trị trung bình các giá trị trong danh sách
    public double average(){
        if (isEmpty()) {
            return 0;
        }
        MyNode current = head;
        int sum = 0, count = 0;
        while (current != null){
            sum += current.getData();
            count ++;
            current = current.getNext();
        }
        
        return (double) sum / count;
        //return count == 0 ? 0.0 : (double) sum / count;   TH1
        //  if (count == 0) {                               TH2 (Giải thích cặn kẽ TH1)
        //      return 0.0;
        //  } else {
        //      return (double) sum / count;
        //  }

    }
    
    // Tìm giá trị lớn nhất trong danh sách
    public int max(){
        if (isEmpty()) {
            throw new IllegalStateException ("Danh Sách rỗng");
        }
        MyNode current = head;
        int max = current.getData();
        while (current != null) {
            if (current.getData() > max) {
                max = current.getData();
            }
            current = current.getNext();
        }
        return 0 ;
    }
}
