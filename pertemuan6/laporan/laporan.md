# laporan pertemuan 6 : Sorting

NAMA : Kibar Mustofa<br>
KELAS : TI-1H<br>
NIM : 2341720004<br>
ABSEN : 14<br>

## 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort

### kode class
```
package pertemuan6;

public class mahasiswa {
   String nama;
   int thnMasuk, umur;
   double ipk;

   mahasiswa (String n, int t, int u, double i) {
        nama= n;
        thnMasuk = t;
        umur= u;
        ipk= i;
   }
   void tampil(){
        System.out.println("nama = " + nama);
        System.out.println("tahun masuk = "+ thnMasuk);
        System.out.println("umur = " + umur);
        System.out.println("IPK = " + ipk);
   }
}
```
```
package pertemuan6;

public class daftarMahasiswaBerprestasi {
    mahasiswa listMhs[] = new mahasiswa[5];
    int idx;
    void tambah(mahasiswa m){
        if(idx <listMhs.length){
            listMhs[idx]= m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        for (mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length; j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    mahasiswa tmp = listMhs[j];// swab
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] =tmp;
                }
            }  
        }
    }
}
```
### kode main 
```
package pertemuan6;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        daftarMahasiswaBerprestasi list =new daftarMahasiswaBerprestasi();
        mahasiswa m1 = new mahasiswa("Nusa", 2017, 25, 3);
        mahasiswa m2 = new mahasiswa ("Bara", 2012, 19 ,4);
        mahasiswa m3 = new mahasiswa("Donpu", 2018, 19, 3.5);
        mahasiswa m4 = new mahasiswa("Abdul", 2017, 23, 2);
        mahasiswa m5 = new mahasiswa("Ummi", 2019, 21 , 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("data mahasiswa sebelum sorting = ");
        list.tampil();
        System.out.println("data mahasiswa setelah sorting desc berdasarka ipk");
        list.bubbleSort();
        list.tampil();
    }    
}
```
### hasil tampilan kodebila dijalankan

## 5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort