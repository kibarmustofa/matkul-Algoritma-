package UTS;

public class Barang {
    String nama;
    int stock; 

    public Barang(String n, int s) {
        this.nama = n; 
        this.stock = s;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Stock: " + stock);
    }
}