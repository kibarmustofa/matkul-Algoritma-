package pertemuan5;

import java.util.Scanner;

public class mainpangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan   : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat                  : ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat(nilai, pangkat);
        }
        System.out.println(" hasil pangkat - Brute Force ");
        for(int i=0; i< elemen ; i++) {
            System.out.println("hasil dari " + png [i].nilai+"pangkat"+ png [i].pangkat + "adalah" + png [i].pangkatBF(png[i].nilai, png[i].pangkat));

        }
        System.out.println(" hasil pangkat - Divide and Conquer ");
        for(int i=0; i< elemen ; i++) {
            System.out.println("hasil dari " + png [i].nilai+"pangkat"+ png [i].pangkat + "adalah" + png [i].pangkatDC(png[i].nilai, png[i].pangkat));
            
        }
        sc.close();
    }   
}