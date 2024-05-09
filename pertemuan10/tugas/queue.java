package pertemuan10.tugas;

public class queue {
    pembeli[] antrian;
    int front, rear, size, max;

    public queue(int n){
        max = n;
        antrian = new pembeli[max];
        size = 0;
        front = rear = -1;  
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;            
        }
    }

    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(pembeli antri){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public pembeli dequeue(){
        pembeli antri = new pembeli();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            antri = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return antri;
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " ");
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " ");
            System.out.println("jumlah elemen = " + size);
        }
    }

    public void peek(){
        if (!isEmpty()) {
            System.out.println("elemen terdepan: " +  "nama: "+antrian[front].nama + " no HP: " + antrian[front].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("elemen terbelakang: " + "nama: " + antrian[rear].nama + " no HP: " + antrian[rear].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public int peekPosition(String nama){
        if (isEmpty()) {
            return -1; 
        }
        int pos = -1; 
        int index = front;
        int count = 0;
        while (index != rear){
            if (antrian[index].nama.equals(nama)) {
                pos = count; 
                break;
            }
            index = (index + 1) % max; 
            count++;
        } if (antrian[index].nama.equals(nama)) {
            pos = count;
        }
        if (pos != -1) {
            System.out.println("pembeli dengan nama " + nama + " ditemukan di antrian ke-" + (pos + 1));
            System.out.println(" data pembeli:");
            System.out.println("Nama: " + antrian[(front + pos) % max].nama);
            System.out.println("No HP: " + antrian[(front + pos) % max].noHp);
        } else {
            System.out.println("pembeli dengan nama " + nama + " tidak ditemukan dalam antrian");
        }
        return pos; 
    }
    public void daftarPembeli(){
        if (isEmpty()) {
            System.out.println("queue masih kosong");
        } else {
            System.out.println("daftar Pembeli:");
            int i = front;
            do {
                System.out.println("Nama: " + antrian[i].nama + " no HP: " + antrian[i].noHp);
                i = (i + 1) % max;
                System.out.println("--------------------------");
            } while (i != (rear + 1) % max);
        }
    }   
}

