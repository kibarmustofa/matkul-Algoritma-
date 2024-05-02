package pertemuan8;

public class StackKonversi14{
    int size;
    int[] tumpukanBiner;
    int top;
    public StackKonversi14(){
        this.size = 32; //asusmi
        tumpukanBiner = new int [size];
        top = -1;
    }
    public boolean cekKosong(){
        return top == -1;
    }
    public boolean cekPenuh(){
        return top == size - 1; 
    }
    public void push(int data){
        if (cekPenuh()){
            System.out.println("Stack penuh");
        }else{
            top++;

            tumpukanBiner[top] = data;
        }
    } 
    public int pop(){
        if (cekPenuh()){
            System.out.println("Stack kosong");
            return -1;
        }else{
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    } 
}