import java.util.Scanner;

public class P1_tugas2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Rumus Fisika");
        System.out.println("================================");

        // Memilih rumus yang akan dihitung
        System.out.println("Pilih rumus yang akan dihitung:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void hitungKecepatan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nRumus Kecepatan");
        System.out.println("================");
        System.out.print("Masukkan jarak (s): ");
        double s = sc.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double t = sc.nextDouble();

        double v = s / t;
        System.out.printf("Kecepatan (v) = %.2f%n", v);
    }

    public static void hitungJarak() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nRumus Jarak");
        System.out.println("============");
        System.out.print("Masukkan kecepatan (v): ");
        double v = sc.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double t = sc.nextDouble();

        double s = v * t;
        System.out.printf("Jarak (s) = %.2f%n", s);
    }

    public static void hitungWaktu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nRumus Waktu");
        System.out.println("============");
        System.out.print("Masukkan jarak (s): ");
        double s = sc.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double v = sc.nextDouble();

        double t = s / v;
        System.out.printf("Waktu (t) = %.2f%n", t);
    }
}
