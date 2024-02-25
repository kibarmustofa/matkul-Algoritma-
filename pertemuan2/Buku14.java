public class Buku14 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        
        int hargaTotal = hitungHargaTotal(stok);
        System.out.println("Harga Total: Rp " + hargaTotal);
        
        double diskon = hitungDiskon(hargaTotal);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        
        double hargaBayar = hitungHargaBayar(hargaTotal, diskon);
        System.out.println("Harga Bayar: Rp " + hargaBayar);
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
        stok += jml;
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
