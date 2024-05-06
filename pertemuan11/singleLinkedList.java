package pertemuan11;

public class singleLinkedList {
    node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) { 
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput; 
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        node ndInput = new node(input, null);
        node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        node ndInput = new node(input, null);
        if (index < 0) {
            System.out.println("Perbaiki logikanya! kalau indeksnya -1 bagaiMANA????");
        } else if (index == 0) {
            addFirst(input);
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            ndInput.next = temp.next;
            temp.next = new node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

}
