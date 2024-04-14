package pertemuan7;
public class buku14{
    int  tahunTerbit, stock;
    String judulBuku, kodeBuku, pengarang;

    buku14 (String kodeBuku, int tahunTerbit, int stock, String judulBuku, String pengarang){
        this.kodeBuku = kodeBuku;
        this.tahunTerbit = tahunTerbit;
        this.stock = stock;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
    }

    void tampilDataBuku (){
        System.out.println("===============================");
        System.out.println("Kode Buku : "+kodeBuku);
        System.out.println("Judu Buku : "+judulBuku);
        System.out.println("Tahun Terbit : "+tahunTerbit);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Stock : "+stock);
    }
}