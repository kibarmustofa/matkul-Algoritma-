package pertemuan5;

import java.util.Scanner;

public class mainfaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Masukan jumlah elemen ");
        int ijml = sc.nextInt();

        faktorial[] fk = new faktorial[ijml]; 
        for (int i = 0; i < ijml; i++) {
            fk[i] = new faktorial();
            System.out.println("Masukan nilai data ke- " + (i + 1) + ":");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai; 
        }

        System.out.println("HASIL-BRUTE FORCE");
        for (int i = 0; i < ijml; i++) {
            System.out.println("hasil penghitungan faktorial menggunakan Brute force adalah " + fk[i].faktorialbf(fk[i].nilai));
        }

        System.out.println("HASIL-DEVIDE AND CONQUER");
        for (int i = 0; i < ijml; i++) {
            System.out.println("hasil penghitungan faktorial menggunakan Devide and Conquer adalah " + fk[i].faktorialdc(fk[i].nilai));
        }

    }
}
