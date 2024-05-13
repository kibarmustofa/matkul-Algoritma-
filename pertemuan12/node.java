package pertemuan12;

public class node {
    int data;
    node prev, next;

    node(node prev, int data, node next ){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}