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
    void selectionsort(){
        for(int i=0; i<listMhs.length-1; i++){
            int  idxMin = 1;
            for(int j= i+1; j<listMhs.length;j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i]=tmp;
        }
    }
    void insertionsort(){
        for (int i=1; i<listMhs.length; i++){
            mahasiswa temp = listMhs[i];
            int j= i;
            while  (j > 0 && listMhs[j-1].ipk > temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
