package pertemuan5;

public class showroom {
    String[] merk;
    String[] tipe;
    int[] tahun;
    int[] top_acceleration;
    int[] top_power;

    public showroom(String[] merk, String[] tipe, int[] tahun, int[] top_acceleration, int[] top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public int MaxAcc(int[] arr, int low, int high) {
        if (low == high) {
            return arr[low];
        } else {
            int mid = (low + high) / 2;
            int max1 = MaxAcc(arr, low, mid);
            int max2 = MaxAcc(arr, mid + 1, high);
            return Math.max(max1, max2);
        }
    }

    public int MinAcc(int[] arr, int low, int high) {
        if (low == high) {
            return arr[low];
        } else {
            int mid = (low + high) / 2;
            int min1 = MinAcc(arr, low, mid);
            int min2 = MinAcc(arr, mid + 1, high);
            return Math.min(min1, min2);
        }
    }

    public double rataTopPower(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        String[] merk = {"BMW", "Ford", "Nissan", "Subaru", "Subaru", "Toyota", "Toyota", "Volkswagen"};
        String[] tipe = {"M2 Coupe", "Fiesta ST", "370Z", "BRZ", "Impreza WRX STI", "AE86 Trueno", "86/GT86", "Golf GTI"};
        int[] tahun = {2016, 2014, 2009, 2014, 2013, 1986, 2014, 2014};
        int[] top_acceleration = {6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
        int[] top_power = {728, 575, 657, 609, 703, 553, 609, 631};

        showroom showroom = new showroom(merk, tipe, tahun, top_acceleration, top_power);

        int maxAcceleration = showroom.MaxAcc(top_acceleration, 0, top_acceleration.length - 1);
        int minAcceleration = showroom.MinAcc(top_acceleration, 0, top_acceleration.length - 1);
        double avgPower = showroom.rataTopPower(top_power);

        System.out.println("a) Top acceleration tertinggi: " + maxAcceleration);
        System.out.println("b) Top acceleration terendah: " + minAcceleration);
        System.out.println("c) Rata-rata top power: " + avgPower);
    }
}
