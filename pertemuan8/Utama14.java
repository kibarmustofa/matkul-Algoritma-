package pertemuan8;
import java.util.Scanner;

public class Utama14 {
    public static void main(String[] args) {
        gudang14 gudang = new gudang14(7);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\nMenu:");
            System.out.println("1.tambah barang");
            System.out.println("2.ambil barang");
            System.out.println("3.lihat barang terbawah");
            System.out.println("4.lihat barang teratas");
            System.out.println("5.tampilkan tumpukan barang");
            System.out.println("6.cari barang");
            System.out.println("7.keluar");
            System.out.print("pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    barang14 barangBaru = new barang14(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.lihatBarangTerbawah();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;     
                case 5:
                    gudang.tampilkanBarang();
                    break;
                case 6:
                    gudang.cariBarang(scanner);
                    break;
                case 7:
                    System.exit(0);
                    break;      
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    scanner.close();
            }
        }
    }
}
