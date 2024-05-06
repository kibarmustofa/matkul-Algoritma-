package pertemuan11;

public class sslMain {
    public static void main(String[] args) {
        singleLinkedList singll = new singleLinkedList();
        singll.print();
        singll.addFirst(890);
        singll.print();
        singll.addLast(760);    
        singll.print();
        singll.addFirst(700);
        singll.insertAfter(700, 999);
        singll.print();
        singll.insertAt(3, 833);
        singll.print();    
    }
}
