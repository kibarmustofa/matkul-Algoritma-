import java.util.Scanner;

public class bangunRuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bangun : ");
        int jumlahBangun = sc.nextInt();
       
        Kerucut[] ker = new Kerucut[jumlahBangun];
        for (int j = 0; j < jumlahBangun; j++) {
            System.out.println("Kerucut ke -" + (j + 1));
            System.out.print("Jari-jari kerucut: ");
            int r = sc.nextInt();
            System.out.print("Sisi miring kerucut: ");
            int s = sc.nextInt();
            ker[j] = new Kerucut(r, s);
        }

        for (int j = 0; j < jumlahBangun; j++) {
            System.out.println("Luas Permukaan kerucut ke -" + (j + 1) + " : " + ker[j].LuasPKerucut() + " cm2");
            System.out.println("Volume kerucut ke -" + (j + 1) + " : " + ker[j].VolumKerucut() + " cm3");
        }

        Limas[] lim = new Limas[jumlahBangun];
        for (int j = 0; j < jumlahBangun; j++) {
            lim[j] = new Limas();

            System.out.println("Limas ke -" + (j + 1));
            System.out.print("Panjang sisi alas limas: ");
            lim[j].sisi = sc.nextInt();
            System.out.print("Tinggi limas: ");
            lim[j].tinggi = sc.nextInt();
        }

        for (int j = 0; j < jumlahBangun; j++) {
            System.out.println("Luas Permukaan Limas ke -" + (j + 1) + " : " + lim[j].LuasPLimas() + " cm2");
            System.out.println("Volume Limas ke -" + (j + 1) + " : " + lim[j].VolumLimas() + " cm3");
        }

        Bola[] ball = new Bola[jumlahBangun];
        for (int j = 0; j < jumlahBangun; j++) {
            ball[j] = new Bola();

            System.out.println("Bola ke -" + (j + 1));
            System.out.print("Panjang jari-jari: ");
            ball[j].jariJari = sc.nextInt();
        }

        for (int j = 0; j < jumlahBangun; j++) {
            System.out.println("Luas Permukaan Bola ke -" + (j + 1) + " : " + ball[j].LuasPBola() + " cm2");
            System.out.println("Volume Bola ke -" + (j + 1) + " : " + ball[j].VolumBola() + " cm3");
        }
    }
}
