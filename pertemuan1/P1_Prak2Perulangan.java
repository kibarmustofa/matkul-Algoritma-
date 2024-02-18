import java.util.Scanner;

public class P1_Prak2Perulangan {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Input NIM: ");
        long nim = scanner.nextLong();
        int n = duaDigitAkhir(nim);
        
        if (n < 10) {
            n += 10;
        }

        System.out.print("OUTPUT: ");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            // Cetak angka ganjil dengan asterisk (*) dan angka genap sesuai bilangan aslinya
            System.out.print(i % 2 == 0 ? i + " " : "* ");
        }
    }

    // Method untuk mengambil dua digit terakhir dari NIM
    public static int duaDigitAkhir(long nim) {
        return (int) (nim % 100);
    }
}
      
      