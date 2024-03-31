package pertemuan6;

public class Main {
    public static void main(String[] args) {
        daftarMahasiswaBerprestasi list =new daftarMahasiswaBerprestasi();
        mahasiswa m1 = new mahasiswa("Nusa", 2017, 25, 3);
        mahasiswa m2 = new mahasiswa ("Bara", 2012, 19 ,4);
        mahasiswa m3 = new mahasiswa("Donpu", 2018, 19, 3.5);
        mahasiswa m4 = new mahasiswa("Abdul", 2017, 23, 2);
        mahasiswa m5 = new mahasiswa("Ummi", 2019, 21 , 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("data mahasiswa sebelum sorting = ");
        list.tampil();
        System.out.println("data mahasiswa setelah sorting desc berdasarka ipk");
        list.bubbleSort();
        list.tampil();
        System.out.println("data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionsort();
        list.tampil();
        System.out.println("data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionsort();
        list.tampil();
    }    
}
