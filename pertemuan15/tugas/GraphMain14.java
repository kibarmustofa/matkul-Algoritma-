package pertemuan15.tugas;

import java.util.Scanner;

public class GraphMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex: ");
        int v = sc.nextInt();
        Graph14 graph = new Graph14(v);

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan asal: ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc.nextInt();
                    graph.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = sc.nextInt();
                    try {
                        graph.removeEdge(asal, tujuan);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan vertex: ");
                    asal = sc.nextInt();
                    try {
                        graph.degree(asal);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        graph.printGraph();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Masukkan asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = sc.nextInt();
                    if (graph.cekEdge(asal, tujuan)) {
                        System.out.println("Edge ada");
                    } else {
                        System.out.println("Edge tidak ada");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = sc.nextInt();
                    try {
                        graph.updateJarak(asal, tujuan, jarak);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Jumlah edge: " + graph.hitungEdge());
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
        sc.close();
    }
}
