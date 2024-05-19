package pertemuan12;

public class doubleLinkedList {
   node head;
   int size;
   public doubleLinkedList(){
        head = null;
        size = 0;
   } 
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item){
        if (isEmpty()){
            head = new node (null, item, null);
        }else{
            node newNode = new node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int item){
        if (isEmpty()){
            addFirst(item);
        }else{
            node current = head;
            while (current.next != null){
                current = current.next;
            }
            node newNode = new node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception {
        if (isEmpty()){
            addFirst(item);
        }else if (index < 0 || index > size) {
            throw new Exception("nilai indeks di luar batas");
        }else{
            node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                node newNode = new node (null,item, current);
                current.prev = newNode;
                head = newNode;
            }else {
                node newNode = new node (current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    } 
    public void clear(){
        head = null;
        size = 0;
    }
    public void print() { 
        if (!isEmpty()){
            node tmp = head;
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else {
            System.out.println("linked list kosong");
        }
    }
    // praktikum 2 menambhkan method remove, remove first, removelast
    public void removeFirst() throws Exception{ 
        if(isEmpty()){
            throw new Exception("linked list masih kosong, tidak dapat dihapus ");
        }else if (size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if (isEmpty()){
            throw new Exception("linked list masih kosong, tidak dapat dihapus ");
        } else if(head.next == null){
            head = null;
            size--;
            return;
        }
        node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next=null;
        size--;
    }
    public void remove(int index) throws Exception{
        if(isEmpty()|| index>= size){
            throw new Exception("linked list masih kosong, tidak dapat dihapus ");
        }else if (index ==  0 ){
            removeFirst();
        }else{
            node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next=null;
            }
            else if (current.prev ==  null){
                current = current.next;
                current.prev = null;
                head = current;
            }
            size--;
        }
    }
    //praktikum 3 penambahan getFirst, getLast, dan get.
    public int getFirst() throws Exception{
        if (isEmpty()){
            throw new Exception("linked list masih kosong, tidak dapat dihapus ");
        }
        return head.data;
    }
    public int getLast() throws Exception {
        if (isEmpty()){
            throw new Exception("linked list masih kosong, tidak dapat dihapus ");
        }
        node tmp = head;
        while (tmp.next !=null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("linked list masih kosong, tidak dapat dihapus ");
        } 
        node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        } 
        return tmp.data;
    }
}
