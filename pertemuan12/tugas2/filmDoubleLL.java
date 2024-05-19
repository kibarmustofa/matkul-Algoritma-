package pertemuan12.tugas2;

public class filmDoubleLL {
    node head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        if (isEmpty()) {
            head = new node(null, id, judul, rating, null);
        } else {
            node newNode = new node(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            node newNode = new node(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int index, int id, String judul, double rating) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
    
        if (index == 0) {
            addFirst(id, judul, rating);
            return;
        }
    
        if (index == size) {
            addLast(id, judul, rating);
            return;
        }
    
        node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
    
        node newNode = new node(current, id, judul, rating, current.next);
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        size++;
    }
    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            node tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id );
                System.out.println("\tJudul film    : " + tmp.judul);
                System.out.println("\tRating film   : " + tmp.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Data kosong!");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data masih kosong, tidak dapat mengahpus!");
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
            throw new Exception("Data masih kosong, tidak dapat dihapus!");
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

    public void remove(int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public String getFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List kosong!");
        }
        return head.judul;
    }

    public String getLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List kosong!");
        }
        node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.judul;    
    }

    public String get (int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Linked List kosong!");
        }
        node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.judul;
    }

    public void findFilm(int id) {
        if (!isEmpty()) {
            node tmp = head;
            int index = 0;
            while (tmp != null) {
                if (tmp.id == id) {
                    System.out.println("Ditemukan pada node ke-" + index);
                    System.out.println("ID: " + tmp.id );
                    System.out.println("\tJudul film    : " + tmp.judul);
                    System.out.println("\tRating film   : " + tmp.rating);
                    return;
                }
                tmp = tmp.next;
                index++;
            }
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        } else {
            System.out.println("Data kosong!");
        }
    }
    public void sortFilmByRating() {
        if (size > 1) {
            head = insertionSort(head);
        }
    }

    private node insertionSort(node head) {
        if (head == null || head.next == null) {
            return head;
        }

        node sorted = null;
        node current = head;
        while (current != null) {
            node next = current.next;
            sorted = sortedInsert(sorted, current);
            current = next;
        }
        return sorted;
    }

    private node sortedInsert(node sorted, node newNode) {
        if (sorted == null || sorted.rating <= newNode.rating) {
            newNode.next = sorted;
            if (sorted != null) {
                sorted.prev = newNode;
            }
            newNode.prev = null;
            sorted = newNode;
        } else {
            node current = sorted;
            while (current.next != null && current.next.rating > newNode.rating) {
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        return sorted;
    }

    // Definition of the node class
    class node {
        int id;
        String judul;
        double rating;
        node prev;
        node next;

        node(node prev, int id, String judul, double rating, node next) {
            this.prev = prev;
            this.id = id;
            this.judul = judul;
            this.rating = rating;
            this.next = next;
        }
    }
}

