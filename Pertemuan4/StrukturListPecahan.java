package Pertemuan4;

public class StrukturListPecahan {
    NodePecahan HEAD;
    
    public StrukturListPecahan() {
        HEAD = null;
    }
    
    public boolean isEmpty() {
        return HEAD == null;
    }
    
    public void addHead(double data) {
        NodePecahan newNode = new NodePecahan(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(double data, int position) {
        NodePecahan posNode = null, curNode = null;
        int i;
        
        NodePecahan newNode = new NodePecahan(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            if (position == 1) {
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }
    
    public void addTail(double data) {
        NodePecahan posNode = null, curNode = null;

        NodePecahan newNode = new NodePecahan(data);
        if (isEmpty()){
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }
    
    public void displayElement() {
        NodePecahan curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
}
