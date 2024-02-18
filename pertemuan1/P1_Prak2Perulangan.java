import java.util.Scanner;

public class P1_Prak2Perulangan {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Input NIM: ");
        long nim = scanner.nextLong();
        int nilai = duaDigitAkhir(nim);
        if (nilai < 10) {
            nilai += 10;
        }
        System.out.println("n: " + nilai);
        System.out.print("OUTPUT: ");
        for (int i = 1; i <= nilai; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            System.out.print(i % 2 == 0 ? i + " " : "* ");
        }
    }

    public static int duaDigitAkhir(long nim) {
        return (int) (nim % 100);
    }
}
      
      