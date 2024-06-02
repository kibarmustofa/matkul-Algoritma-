package pertemuan13;

public class BinaryTreeArray14 {
    int[] data;
    int idxLast;

    public BinaryTreeArray14(){
        data = new int [10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    public void traversePreOrder(int index) {
        if (index <= idxLast) {
            System.out.print(" " + data[index]);
            traversePreOrder(2 * index + 1);
            traversePreOrder(2 * index + 2);
        }
    }

    public void traverseInOrder(int index) {
        if (index <= idxLast) {
            traverseInOrder(2 * index + 1);
            System.out.print(data[index] + " ");
            traverseInOrder(2 * index + 2);
        }
    }
   
    public void traversePostOrder(int index) {
        if (index <= idxLast) {
            traversePostOrder(2 * index + 1);
            traversePostOrder(2 * index + 2);
            System.out.print(" " + data[index]);
        }
    }

}
