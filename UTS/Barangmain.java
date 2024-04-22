package UTS;

public class Barangmain {
    public static void main(String[] args) {
        Barang[] daftarBarang = {
            new Barang("papan dada", 39),
            new Barang("tatakan chat", 27),
            new Barang("penghapus", 19),
            new Barang("crayon", 19),
            new Barang("tempat pencil", 25),
            new Barang("meja lipat", 27),
            new Barang("kertas kado", 5),
            new Barang("rautan", 7),
            new Barang("kertas hvs", 44),
            new Barang("spidol", 7),
            new Barang("kuas", 42),
            new Barang("buku gambar", 43),
            new Barang("pensil warna", 38),
            new Barang("buku", 41),
            new Barang("canvas", 4),
            new Barang("pensil", 42)
        };
        Toko toko = new Toko(daftarBarang);
        
        toko.cetakDaftarBarang();
        toko.bubbleSort();
    }
}