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

    public Buku14() {
        
    }
    public Buku14(String jud, String PE, int hal, int stok, int har  ){
        judul = jud; 
        pengarang = PE;
        halaman = hal;
        this.stok = stok;
        harga = har; 
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
    int hitungHargaTotal(int jmlBukuTerjual) {
        return harga * jmlBukuTerjual;
    }

    double hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            return 0.12; 
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return 0.05; 
        } else {
            return 0; 
        }
    }

    double hitungHargaBayar(int hargaTotal, double diskon) {
        return hargaTotal - (hargaTotal * diskon);
    }
}