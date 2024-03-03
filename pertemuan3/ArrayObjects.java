import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegiPanjang = sc.nextInt();
        persegiPanjang[] ppArray = new persegiPanjang[jumlahPersegiPanjang];
        
        for (int i = 0; i < jumlahPersegiPanjang; i++){
            ppArray[i] = new persegiPanjang();
            System.out.println("persegi panjang ke -" + i );
            System.out.print("masukan panjang: " );
            ppArray[i].panjang = sc.nextInt();
            System.out.print("masukan lebar: " );
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < jumlahPersegiPanjang; i++ ){
            System.out.println("persegi panjang ke-"+ i );
            System.out.println("panjang: "+ ppArray[i].panjang + ", lebar: " + ppArray[i].lebar );
        }
    }
}

