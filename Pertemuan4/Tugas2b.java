package Pertemuan4;

public class Tugas2b {
    public static void main(String[] args) {
        StrukturListPecahan listPecahan = new StrukturListPecahan();
        
        listPecahan.addHead(3.4);
        listPecahan.addMid(2.1, 2);
        listPecahan.addMid(1.1, 3);
        listPecahan.addMid(4.5, 4);
        listPecahan.addTail(5.5);
        listPecahan.displayElement();
    }
}
