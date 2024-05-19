package pertemuan12;

public class doubleLinkedListMain {
   public static void main(String[] args) throws Exception {
    // praktikum 1 main   
    System.out.println("percobaan 1 add");
    doubleLinkedList dll = new doubleLinkedList();
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("======================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("======================================================");
        dll.add(40,1);
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("======================================================");
        dll.clear();
        dll.print();
        System.out.println("size : "+dll.size());
    // praktikum 2 main
        System.out.println("percobaan 2 remove");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("======================================================");
        dll.removeFirst();
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("======================================================");
        dll.removeLast();
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("======================================================");
        dll.remove(1);
        dll.print();
        System.out.println("size : "+dll.size());
    // praktikum 3 main
        System.out.println("size : " +dll.size());
        System.out.println("====================="  );
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("size : " +dll.size());
        System.out.println("====================="  );
        dll.add(40, 1);
        dll.print();
        System.out.println("size : " +dll.size());
        System.out.println("====================="  );
        System.out.println("data awal pada linked lists adalah: " +dll.getFirst());
        System.out.println("data akhir linked lists adalah: " +dll.getLast());
        System.out.println("pada indeks ke - 1 pada linked lists adalah: " + dll.get(1));
    } 
}