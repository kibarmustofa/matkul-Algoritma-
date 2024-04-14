package pertemuan7;

import java.util.Scanner;

public class bukumain14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        pencarianbuku14 data = new pencarianbuku14();
        int jumBuku = 5;

        for (int i = 0; i < jumBuku; i++){
        System.out.println("-----------------------------------------------");
        System.out.print("Kode Buku \t : ");
        String kodeBuku = s.next();
        System.out.print("Judul Buku \t : ");
        String judulBuku = s1.next();
        System.out.print("Tahun Terbit \t : ");
        int tahunTerbit = s.nextInt();
        System.out.print("Pengarang \t : ");
        String pengarang = s1.nextLine();
        pengarang = s1.nextLine();
        System.out.print("Stock \t : ");
        int stock = s.nextInt();

        buku14 m = new buku14(kodeBuku, tahunTerbit, stock, judulBuku, pengarang);
        data.tambah(m);
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampi();
        
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("Mencari menggunakan :");
        System.out.println("1. Kode Buku");
        System.out.println("2. Judul Buku");
        System.out.print("Pilih (1/2) : ");
        int plh = s.nextInt();

        switch (plh) {
            case 1:
                System.out.println("Masukkan kode Buku yang dicari");
                System.out.print("Kode Buku : ");
                String cari = s.next();
                System.out.println("Menggunakan Sequential Search");
                int posisi = data.FindSeqSearch(cari);
                data.Tampilposisi(cari, posisi);
                data.TampilData(cari, posisi);
                buku14 dataBuku = data.FindBuku(cari);
                if (dataBuku != null) {
                    dataBuku.tampilDataBuku();
                } else {
                    System.out.println("Buku tidak ditemukan.");
                }
                System.out.println("==============================================");
                System.out.println("Menggunakan Binary Search");
                posisi=data.FindBinarySearch(cari, 0, jumBuku-1);
                data.Tampilposisi(cari, posisi);
                data.TampilData(cari, posisi);
                break;
            case 2:
                System.out.println("Masukkan judul Buku yang dicari");
                System.out.print("Judul Buku : ");
                String cari2 = s1.next();
                System.out.println("Menggunakan Sequential Search");
                int posisi2 = data.FindSeqSearchStr(cari2);
                data.TampilposisiJudul(cari2, posisi2);;
                data.TampilDataJudul(cari2, posisi2);;
                System.out.println("==============================================");
                System.out.println("Menggunakan Binary Search");
                posisi2 = data.FindBinarySearchJudul(cari2, 0, jumBuku-1);
                data.FindAndDisplayDuplicates(cari2);
                data.TampilposisiJudul(cari2, posisi2);
                data.TampilDataJudul(cari2, posisi2);;
                break;
        }
        
        s.close();
        s1.close();
    }
}