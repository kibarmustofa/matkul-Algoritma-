package pertemuan11.tugas2;

public class queueSLL {
    private node head, tail;

    void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("Isi Antrian: ");
            while (tmp != null) {
                System.out.print("("+tmp.nim + " - " + tmp.nama + ")");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void enqueue(int data, String nama) {
        node newAntrian = new node(data, nama);

        if (isEmpty()) {
            this.head = this.tail = newAntrian;
            return;
        }
        this.tail.next = newAntrian;
        this.tail = newAntrian;
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, " + "tidak dapat dihapus");
        } else {
            System.out.println("Dequeue: " + head.nim + " " + head.nama);
            head = head.next;
            if (head == null) {
                tail = null; 
            }
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return -1;
        }
        return this.head.nim;
    }

    boolean isEmpty() {
        return this.head == null;
    }
}