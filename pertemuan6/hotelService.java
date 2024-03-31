package pertemuan6;

public class hotelService {
    hotel rooms[] = new hotel[5];
    int idx;

    void tambah(hotel h){
        if(idx <rooms.length){
            rooms[idx]= h;
            idx++;
        }else{
            System.out.println("data sudah terpenuhi");
        }
    }
    void tampil(){
        for(hotel h : rooms){
            h.tampil();
            System.out.println("--------------------------------------------------------------------------------");
        }
    }
 
    void bubblesortHarga() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    hotel tmp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tmp;
                }
            }
        }
    }

    void bubblesortRating() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (rooms[j].bintang < rooms[j + 1].bintang) {
                    hotel tmp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tmp;
                }
            }
        }
    }

    void selectionsortHarga() {
        int n = idx;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (rooms[j].harga < rooms[minIdx].harga) {
                    minIdx = j;
                }
            }
            hotel tmp = rooms[minIdx];
            rooms[minIdx] = rooms[i];
            rooms[i] = tmp;
        }
    }

    void selectionsortRating() {
        int n = idx;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (rooms[j].bintang > rooms[maxIdx].bintang) {
                    maxIdx = j;
                }
            }
            hotel tmp = rooms[maxIdx];
            rooms[maxIdx] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
