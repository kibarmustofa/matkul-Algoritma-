package pertemuan12.tugas;

public class vaksinDoubleLL {
    node head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nomor, String nama) {
        if (isEmpty()) {
            head = new node(null, nomor, nama, null);
        } else {
            node newnode = new node(null, nomor, nama, head);
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }

    public void addLast(int nomor, String nama) {
        if (isEmpty()) {
            addFirst(nomor, nama);
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            node newnode = new node(current, nomor, nama, null);
            current.next = newnode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Vaksin masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Vaksin masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public String getFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Antrean Vaksin kosong!");
        }
        return head.nama;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            node tmp = head;
            while (tmp != null) {
                System.out.println("|" +tmp.nomor + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Vaksin kosong!");
        }
    }

}

