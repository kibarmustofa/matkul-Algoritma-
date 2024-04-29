package pertemuan8;

public class gudang14 {
    barang14[] tumpukan;
    int size;
    int top;

    public gudang14(int kapasitas){
        size = kapasitas;
        tumpukan = new barang14[size];
        top= - 1;
    }
    public boolean cekKosong(){
        if(top== -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean cekPenuh(){
        if(top== size-1){
            return true;
        }else{
            return false;
        }
    }
    public void tambahBarang(barang14 brg ){
        if(!cekPenuh()){
            top++;
            tumpukan[top]= brg;
            System.out.println("barang "+ brg.nama+"berhasil ditambahkan ke gudang");
        }else{
            System.out.println("gagal! tumpukan barang di gudang sudah penuh");
        }
    }
    public barang14 ambilBarang(){
        if (!cekKosong()){
            barang14 delete = tumpukan[top];
            top--;
            System.out.println("barang" +delete.nama+ "diambil dari gudang");
            return delete; 
        }else{
            System.out.println("tumpukan baarang kosoong");
            return null;
        }
    }
    public barang14 lihatBarangTeratas(){
        if (!cekKosong()){
            barang14 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+ barangTeratas.nama );
            return barangTeratas;
        }else{
            System.out.println("tumpukan barang kosong");
            return null;
        }
    }
    public void tampilkanBarang(){
        if (!cekKosong()){
            System.out.println("rincian tumpukan barng di gudang");
            for (int i = top; i >= 0; i --){
                System.out.printf("kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else{
            System.out.println("tumpukan barang kosong.");
        } 
    }
}
