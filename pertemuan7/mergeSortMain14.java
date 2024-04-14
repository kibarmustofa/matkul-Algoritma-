package pertemuan7;

public class mergeSortMain14 {
    public static void main(String[] args) {
        int data [] = {10,40,30,50,70,20,100,90};
        mergeSorting14 mSort = new mergeSorting14();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Diurutkan ");
        mSort.printArray(data);
    }
}