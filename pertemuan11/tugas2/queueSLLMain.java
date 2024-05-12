package pertemuan11.tugas2;

public class queueSLLMain {
    public static void main(String[] args) {
        queueSLL queue = new queueSLL();
        queue.enqueue(111, "Anton");
        queue.print();
        queue.enqueue(112, "Prita");
        queue.print();
        queue.enqueue(113, "Yusuf");
        queue.print();
        queue.enqueue(114, "Doni");
        queue.print();
        queue.enqueue(115, "Sari");
        queue.print();
        System.out.println();

        System.out.println("Elemen paling depan antrian: " + queue.peek());
        queue.dequeue();

        System.out.println();
        System.out.println("Antrian setelah dequeue");
        queue.print();
        System.out.println();
    }    
}
