import java.util.Scanner ;

public class P1_Prak3Array {
    public static void main(String[] args ) {
        
        Scanner sc = new Scanner(System.in);
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving ",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilai = new double[mataKuliah.length];
        double[] bobotNilai = {3.0,4.0,3.0,4.0,4.0,2.5,2.5,4.0};
        int[] sks ={2,2,2,3,2,2,3,2};
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            nilai[i] = sc.nextDouble();
        }
        System.out.println("======================");
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("======================");
        System.out.println("MK\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        double totalBobotNilai = 0;
        int totalSks = 0;
        
        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilai(nilai[i]);
            totalBobotNilai += bobotNilai[i] * sks [i];
            totalSks += sks [i];
            System.out.printf("%-40s%-15.2f%-15s%-15.2f%n", mataKuliah[i], nilai[i], nilaiHuruf, bobotNilai[i]);
        }

        double ipSemester = totalBobotNilai / totalSks;
        System.out.println("===============================");
        System.out.printf("IP: %.2f%n ", ipSemester);
    }

    public static String konversiNilai(double nilai) {
        if (nilai > 80) {
            return "A";
        } else if (nilai > 73) {
            return "B+";
        } else if (nilai > 65) {
            return "B";
        } else if (nilai > 60) {
            return "C+";
        } else if (nilai > 50) {
            return "C";
        } else if (nilai > 39) {
            return "D";
        } else {
            return "E";
        } 
    }
}