package pertemuan7;

import java.util.Scanner;

public class bukumain14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
         
        pencarianbuku14 data = new pencarianbuku14();
        int jumBuku = 5;

        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kodeBuku terkecil : ");
        for(int i = 0; i < jumBuku ; i++) {
            System.out.println("------------------");
            System.out.print("Kode buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stok \t\t: ");
            int stock = s.nextInt();
            
            buku14 m = new buku14(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.print("Pencarian data: ");
        System.out.print("Masukkan kode buku yang dicari: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        s.close();
        s1.close();
        System.out.println("=========================================================");
        System.out.println(" menggunakan binary search");
        posisi = data.findBinarySearch(cari, 0, jumBuku -1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    
    }
}
