import java.util.Scanner;

public class P1_Prak1pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        double rata;

        System.out.println("program hitung nilai akhir ");
        System.out.println("==================================");
        System.out.print("Masukkan nilai tugas anda \t: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis anda \t: ");
        kuis = sc.nextInt();
        System.out.print("masukkan nilai UTS anda \t: ");
        uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS anda \t: ");
        uas = sc.nextInt();

        if (tugas < 0 || kuis < 0 || uts < 0 || uas < 0) {
            System.out.println("Nilai tidak valid");
            return;
        }

        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.println("==================================");
        System.out.println("==================================");
        rata = tugas * 0.2 + kuis * 0.2 + uts * 0.3 + uas * 0.4;
        System.out.println("Nilai total anda adalah = " + rata);

        if (rata >= 0 && rata <= 100) {
            if (rata > 80) {
                System.out.println("Nilai anda A");
            } else if (rata > 73) {
                System.out.println("Nilai anda B+");
            } else if (rata > 65) {
                System.out.println("Nilai anda B");
            } else if (rata > 60) {
                System.out.println("Nilai anda C+");
            } else if (rata > 50) {
                System.out.println("Nilai anda C");
            } else if (rata > 39) {
                System.out.println("Nilai anda D");
            } else {
                System.out.println("Nilai anda E");
            }
        }
        System.out.println("==================================");
        System.out.println("==================================");
        if (rata > 50) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}