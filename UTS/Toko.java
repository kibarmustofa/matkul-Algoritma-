package UTS;

public class Toko {
    Barang[] daftarBarang;

    public Toko(Barang[] daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

    public void bubbleSort() {
        int n = daftarBarang.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (daftarBarang[j].stock > daftarBarang[j+1].stock) {
                    Barang temp = daftarBarang[j];
                    daftarBarang[j] = daftarBarang[j+1];
                    daftarBarang[j+1] = temp;
                }
            }
        }
    }

    public void cetakDaftarBarang() {
        System.out.println("Daftar barang setelah diurutkan berdasarkan stok:");
        for (Barang barang : daftarBarang) {
            barang.tampil();
        }
    }
}