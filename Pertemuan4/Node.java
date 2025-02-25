package Pertemuan4;

public class Node {
    private int data;
    private Node next;
    
    // INISIALISASI ATRIBUT NODE
    public Node(int data){
        this.data = data;
    }
    
    // SETTER AND GETTER
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
