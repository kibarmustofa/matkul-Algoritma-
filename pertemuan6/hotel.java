package pertemuan6;

public class hotel {
    String nama, kota;
    int harga;
    Byte bintang;

    hotel(String n, String k, int h, Byte b ){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    void tampil(){
        System.out.println("nama = "+nama);
        System.out.println("kota = "+kota );
        System.out.println("harga = "+harga);
        System.out.println("bintang = "+bintang);
    }
}
