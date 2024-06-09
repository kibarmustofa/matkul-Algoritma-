 package pertemuan15.tugas;

 public class Node14{
    int data;
    Node14 prev, next;
    int jarak;

    Node14 (Node14 prev, int data, int jarak, Node14 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
 }