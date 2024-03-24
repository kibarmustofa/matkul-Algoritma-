package pertemuan5;

import java.util.Scanner;

public class mainsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan juta; misal: 5.9)");

        System.out.print("Masukkan jumlah perusahaan: ");
        int perusahaan = sc.nextInt();

        Sum[][] sm = new Sum[perusahaan][];
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("================================================================");
            System.out.print("Masukkan jumlah bulan untuk perusahaan " + (i + 1) + ": ");
            int bln = sc.nextInt();
            sm[i] = new Sum[bln];

            for (int j = 0; j < bln; j++) {
                System.out.print(" > Masukkan keuntungan di bulan ke-" + (j + 1) + ": ");
                double profit = sc.nextDouble();
                sm[i][j] = new Sum(1);
                sm[i][j].keuntungan[0] = profit;
            }
        }

        System.out.println("================================================================");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println(" PERUSAHAAN " + (i + 1));
            double[] profits = new double[sm[i].length];
            for (int j = 0; j < sm[i].length; j++) {
                profits[j] = sm[i][j].keuntungan[0]; 
            }
            System.out.println(" BRUTE FORCE");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].length + " bulan   : "
                    + new Sum(sm[i].length).totalBF(profits));
            System.out.println("DIVIDE and CONQUER");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].length + " bulan   : "
                    + new Sum(sm[i].length).totalDC(profits, 0, sm[i].length - 1));
            System.out.println();
        }

        sc.close();
    }
}
