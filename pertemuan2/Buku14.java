public class Buku14 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("judul: " + judul);
        System.out.println("penagarang: " + pengarang);
        System.out.println("jumlah halaman: " + halaman);
        System.out.println("sisa stok " + stok);
        System.out.println("harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok >= jml) {
            stok -= jml;
        }else{
            System.out.println("stock berlebih dari penjualan");
        }
    }
    
    void restock(int jml){
        harga+= jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    
}