public class BukuMain14 {
    public static void main(String[] args) {
       Buku14 bk1 = new Buku14 ();
       bk1.judul = "Today Ends Tomorrow Comes";
       bk1.pengarang = "Denada Pratiwi";
       bk1.halaman = 198;
       bk1.stok = 13;
       bk1.harga = 71000;

       bk1.tampilInformasi();
       bk1.terjual(5);
       bk1.gantiHarga(60000);
       bk1.tampilInformasi();
       bk1.hitungHargaTotal(10);
       bk1.hitungDiskon(0);
       bk1.hitungHargaBayar(0, 0);


       Buku14 bk2 = new Buku14("Self Reward", "Maheera Ayesha", 160, 29, 59000 );
       bk2.terjual(11);
       bk2.tampilInformasi();
       bk2.tampilInformasi();
       bk2.hitungHargaTotal(8);
       bk2.hitungDiskon(0);
       bk2.hitungHargaBayar(0, 0);

       Buku14 BukuKibar = new Buku14("Sherlock Holmes", "Arthur Conan Doyle", 700, 30, 129000);
       BukuKibar.tampilInformasi();

    }
}