package Pertemuan3;

public class Test3a {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        list.addHead(3);
        list.addHead(2);
        list.addHead(1);
        
        System.out.println("Elemen: ");
        list.displayElement();
    }
}
