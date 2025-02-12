package Pertemuan2;

public class Node {
    private int nilai;
    private Node next;
    
    // INISIALISASI NODE
    public Node(int nilai) {
        this.nilai = nilai;
    }
    
    // GETTER & SETTER nilai
    public int getNilai() {
        return nilai;
    }
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    // GETTER & SETTER next
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
