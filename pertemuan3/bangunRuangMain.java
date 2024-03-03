import java.util.Scanner;
public class bangunRuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Kerucut[] ker = new Kerucut[1];
        for (int i = 0; i < ker.length; i++) {
            System.out.println("Kerucut ke -" + i);
            System.out.print("Jari-jari kerucut: ");
            int r = sc.nextInt();
            System.out.print("sisi Miring kerucut: ");
            int s = sc.nextInt();
            ker[i] = new Kerucut(r, s);
        }

        for (int i = 0; i < ker.length; i++) {
            System.out.println("Luas Permukaan kerucut ke -" + i + " : " + ker[i].LuasPKerucut() + " cm2");
            System.out.println("Volume kerucut ke -" + i + " : " + ker[i].VolumKerucut() + " cm3");
        }

        Limas[] lim = new Limas[1];
        for (int i = 0; i < lim.length; i++) {
            lim[i] = new Limas();

            System.out.println("Limas ke -" + i);
            System.out.print("Panjang sisi alas limas: ");
            lim[i].sisi = sc.nextInt();
            System.out.print("Tinggi limas: ");
            lim[i].tinggi = sc.nextInt();
        }

        for (int i = 0; i < lim.length; i++) {
            System.out.println("Luas Permukaan Limas ke -" + i + " : " + lim[i].LuasPLimas() + " cm2");
            System.out.println("Volume Limas ke -" + i + " : " + lim[i].VolumLimas() + " cm3");
        }
        Bola[] ball = new Bola[1];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = new Bola();

            System.out.println("Bola ke -" + i);
            System.out.print("Panjang jari-jari: ");
            ball[i].jariJari = sc.nextInt();
        }

        for (int i = 0; i < ball.length; i++) {
            System.out.println("Luas Permukaan Bola ke -" + i + " : " + ball[i].LuasPBola() + " cm2");
            System.out.println("Volume Bola ke -" + i + " : " + ball[i].VolumBola() + " cm3");
        }
    }
}
