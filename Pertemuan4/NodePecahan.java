package Pertemuan4;

public class NodePecahan {
    private double data;
    private NodePecahan next;
    
    // INISIALISASI ATRIBUT NODE
    public NodePecahan(double data){
        this.data = data;
    }
    
    // SETTER AND GETTER
    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public NodePecahan getNext() {
        return next;
    }

    public void setNext(NodePecahan next) {
        this.next = next;
    }
}
