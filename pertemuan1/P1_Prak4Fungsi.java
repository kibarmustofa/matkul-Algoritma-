import java.util.Scanner;

public class P1_Prak4Fungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        
        do{
            
            System.out.println("-      selamat datang      -");
            System.out.println("============================");
            System.out.println("menu: ");
            System.out.println("1. total pendapatan toko cabang ");
            System.out.println("2. stok dari toko cabang ");
            System.out.println("3. keluar ");
            System.out.println("============================");
            System.out.print("pilih menu: ");
            menu = sc.nextInt();

            switch (menu) { 
                case 1:
                int toko = 0;

                System.out.println("-  pendapatan toko cabang  -");
                System.out.println("============================");
                System.out.println("cabang toko:");
                System.out.println("1. RoyalGarden 1 ");
                System.out.println("2. RoyalGarden 2 ");
                System.out.println("3. RoyalGarden 3 ");
                System.out.println("4. RoyalGarden 4 ");
                System.out.println("5. kembali  ");
                System.out.println("============================");
                System.out.print("pilih cabang toko: ");
                toko = sc.nextInt();

                System.out.println("============================");
                System.out.println("toko : RoyalGarden" + toko );
                System.out.println("pedapatan cabang toko: " + pendapatantoko(toko) );
                System.out.println("============================");
            
                break;

                case 2:
            
                System.out.println("- stock barang cabang toko -" );
                System.out.println("============================");
                System.out.println("toko: ");
                System.out.println("1. RoyalGarden 1 ");
                System.out.println("2. RoyalGarden 2 ");
                System.out.println("3. RoyalGarden 3 ");
                System.out.println("4. RoyalGarden 4 ");
                System.out.println("5. kembali  ");
                System.out.println("============================");
                System.out.print("pilih cabang toko: ");
                int cabang = sc.nextInt();

                System.out.println("| Toko            : RoyalGarden " + cabang + "\t\t\t\t\t|");
                System.out.println("=========================================");
                System.out.println(
                        "| Stok Awal       : " + tanaman[0] + ":" + jmlTanaman[cabang - 1][0] + ", " + tanaman[1]
                                + ":"
                                + jmlTanaman[cabang - 1][1] + ", " + tanaman[2] + ":" + jmlTanaman[cabang - 1][2]
                                + ", " + tanaman[3] + ":" + jmlTanaman[cabang - 1][3] + "\t\t|");

                if (cabang == 4) {
                    jmlTanaman[3][0] -= 1; // Aglonema
                    jmlTanaman[3][1] -= 2; // Keladi
                    jmlTanaman[3][3] -= 5; // Mawar
                    System.out.println(
                            "| Stok Berkurang  : Aglonema: -1" + ", Keladi: -2" + ", Alocasia: -0" + ", Mawar: -5"
                                    + "\t|");
                    System.out.println(
                            "| Stok Sekarang   : Aglonema:" + jmlTanaman[cabang - 1][0] + ", Keladi:"
                                    + jmlTanaman[cabang - 1][1] + ", Alocasia:" + jmlTanaman[cabang - 1][2]
                                    + ", Mawar:" + jmlTanaman[cabang - 1][3] + "\t\t|");

                } else {
                    System.out.println(
                            "| Stok Sekarang   : Aglonema:" + jmlTanaman[cabang - 1][0] + ", Keladi:"
                                    + jmlTanaman[cabang - 1][1] + ", Alocasia:" + jmlTanaman[cabang - 1][2]
                                    + ", Mawar:" + jmlTanaman[cabang - 1][3] + "\t\t|");

                }
                System.out.println("=========================================================================");

                break;

            default:
                break;
        }

    } while (menu != 0);
}

    static String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
    };
    static String[] tanaman = {
            "Aglonema",
            "Keladi",
            "Alocasia",
            "Mawar"
    };
    static int[][] jmlTanaman = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };
    static double[] harga = {
            75000,
            50000,
            60000,
            10000
    };

    static int pendapatantoko(int taman) {
        int pendapatan = 0;
        int cabang = taman;
        cabang -= 1;
        for (int i = 0; i < tanaman.length; i++) {
            pendapatan += (harga[i] * jmlTanaman[cabang][i]);
        }
        return pendapatan;
    }
}