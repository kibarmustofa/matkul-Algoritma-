package pertemuan11.tugas1;

public class singLLMain {
    public static void main(String[] args) {
        mhsSingLL linkedList = new mhsSingLL();
        linkedList.addFirst(111, "Anton");
        linkedList.print();
        linkedList.addLast(114, "Doni");
        linkedList.print();
        linkedList.insertAfter(111, 112, "Prita");
        linkedList.print();
        linkedList.insertAt(2, 113, "Yusuf");
        linkedList.print();
        linkedList.addLast(115, "Sari");
        linkedList.print();
    }
}
