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
        System.out.println("data pada indeks ke-1="+ singll.getData(1));
        System.out.println("data 3 berada pada indeks ke-"+ singll.indexOf(760));
        
        singll.remove(999);
        singll.print();
        singll.removeAt(0);
        singll.print();
        singll.removeFirst();
        singll.print();
        singll.removeLast();
        singll.print();
    }
}
