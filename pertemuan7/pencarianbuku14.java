package pertemuan7;
public class pencarianbuku14{
    buku14 listBK[]= new buku14[5];
    int idx;

    void tambah(buku14 m){
        if (idx <listBK.length){
            listBK[idx] = m;
            idx++;
        }else{
            System.out.println("data sudah penuh!");
        }
    }
    void tampil(){
        for (buku14 m : listBK){
            m.tampilDataBuku();
        }
    }
    public int findSeqSearch(int cari){
        int posisi= -1;
        for(int j = 0; j < listBK.length; j++ ){
            if (listBK[j].kodeBuku==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if (pos!= -1){
            System.out.println("data : "+x+"ditemukan pada index "+pos);
    
        }else{
            System.out.println("data : "+x+"tidak ditemukan");
        }
    }
    public void tampilData(int x, int pos){
        if (pos!=-1){
            System.out.println("kod buku\t : "+ x );
            System.out.println("judul\t\t : "+ listBK[pos].judulBuku);
            System.out.println("tahun terbit\t : "+listBK[pos].judulBuku);
            System.out.println("pengarang\t :"+listBK[pos].pengarang);
            System.out.println("stock\t\t : "+listBK[pos].stock);

        }else{
            System.out.println(" data "+x+"tidak ditemukan");
        }
    }
    public int findBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBK[mid].kodeBuku == cari) {
                return mid;
            }
            if (listBK[mid].kodeBuku > cari) {
                return findBinarySearch(cari, left, mid - 1);
            }
            return findBinarySearch(cari, mid + 1, right);
        }
        return -1;
    }
}