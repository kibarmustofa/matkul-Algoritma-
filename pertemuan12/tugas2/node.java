package pertemuan12.tugas2;

public class node {
    int id; 
    String judul;
    double rating;
    node prev, next;

    node (node prev, int id, String judul, double rating, node next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
