package pertemuan6;

public class mainHotel {
    public static void main(String[] args) {
        hotelService list = new hotelService();
        hotel m1 = new hotel("Pelangi", "malang", 210000, (byte)4);
        hotel m2 = new hotel("Savina", "malang", 239000, (byte)2);
        hotel m3 = new hotel("Oiyo", "batu", 100000, (byte)1);
        hotel m4 = new hotel("B.O.B", "surabaya", 1299000, (byte)5);
        hotel m5 = new hotel("UMRitz", "malang", 354000, (byte)3);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data rating hotel menurut harga");
        System.out.println("data hotel sebagai berikut sorting secara bubblesort: " );
        list.bubblesortHarga();
        list.tampil();
        System.out.println("--------------------------------------------------------");
        System.out.println("data hotel sebagai berikut sorting secara selectionsort: " );
        list.selectionsortHarga();
        list.tampil();
        System.out.println("========================================================");
        System.out.println("Data rating hotel menurut bintang");
        System.out.println("data hotel sebagai berikut sorting secara bubblesort: " );
        list.bubblesortRating();
        list.tampil();
        System.out.println("--------------------------------------------------------");
        System.out.println("data hotel sebagai berikut sorting secara selectionsort: " );
        list.selectionsortRating();
        list.tampil();
        System.out.println("=========================================================");
    }    
}
    

