
package sll02;

/**
 *
 * @author Admin
 */
public class Node {
    private Product data;
    private Node next;

    public Node() {
        next = null;
    }

    public Node(Product data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Product data) {
        this.data = data;
          this.next = null;
    }

    public Product getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Product data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    
}
