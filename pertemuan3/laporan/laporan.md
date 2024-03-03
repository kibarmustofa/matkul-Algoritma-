NAMA : Kibar Mustofa<br>
KELAS : TI-1H<br>
NIM : 2341720004<br>
ABSEN : 14<br>



### hasil kode percobaan 1
#### class
```
public class ArrayObjects {
    public static void main(String[] args) {
        persegiPanjang[] ppArray = new persegiPanjang[3]; 
        ppArray[0] = new persegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;
    
        ppArray[1] = new persegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
    
        ppArray[2] = new persegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;
    
        System.out.println("persigi panjang ke-0, panjan: "+ ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("persigi panjang ke-0, panjan: "+ ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
        System.out.println("persigi panjang ke-0, panjan: "+ ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
    }
}
```
#### main
```

public class persegiPanjang {
    public int panjang;
    public int lebar;
}
```
### hasil kode percobaan 2
#### class
import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        persegiPanjang[] ppArray = new persegiPanjang[3]; 
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            ppArray[i] = new persegiPanjang();
            System.out.println("persegi panjang ke -" + i );
            System.out.print("masukan panjang: " );
            ppArray[i].panjang = sc.nextInt();
            System.out.print("masukan lebar: " );
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++ ){
            System.out.println("persegi panjang ke-"+ i );
            System.out.println("panjang: "+ ppArray[i].panjang + ", lebar: " + ppArray[i].lebar );
        }
    }
}

#### pertanyaan 3 percobaan 2
```
  System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegiPanjang = sc.nextInt();
        persegiPanjang[] ppArray = new persegiPanjang[jumlahPersegiPanjang];
        
        for (int i = 0; i < jumlahPersegiPanjang; i++){
```
### hasil percobaan 3
#### class
```
public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public int hitungVolume(){
        return panjang * lebar * tinggi;
    } 
}
```
#### main
```
public class ArrayBalok{
    public static void main(String[] args) {
        Balok[] blArray = new Balok[3]; 
        blArray[0] = new Balok(100,30,12);
        blArray[1] = new Balok(120,40,15);
        blArray[2] = new Balok(210,50,25);

        for (int i = 0; 1 < 3; i++){
            System.out.println("volume balok ke "+ i + ":" +blArray[i].hitungVolume());
        }
    }
}
```

