package pertemuan13;

public class BinaryTreeMain14 {
    public static void main(String[] args) {
        BinaryTree14 bt = new BinaryTree14();

        //rekursif
        bt.addRekurisif(6);
        bt.addRekurisif(4);
        bt.addRekurisif(8);
        bt.addRekurisif(3);
        bt.addRekurisif(5);
        bt.addRekurisif(7);
        bt.addRekurisif(9);
        bt.addRekurisif(10);
        bt.addRekurisif(15);

        System.out.println("");
        System.out.print("Preorder Traversal : ");
        bt.traversePreOrder(bt.root);

        System.out.println("");
        System.out.print("PreOrder Traversal:");
        bt.traversePreOrder(bt.root);
        System.out.println();

        System.out.print("PostOrder Traversal:");
        bt.traversePostOrder(bt.root);
        System.out.println();

        System.out.println("");
        System.out.println("Find Node : "+bt.find(5));

        System.out.println("Delete Node 8");
        bt.delete(8);

        System.out.println("");
        System.out.print("Preorder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        
        System.out.println("Minimum value: " + bt.findMin());
        System.out.println("Maximum value: " + bt.findMax());

        System.out.print("Leaf nodes:");
        bt.printLeaf(bt.root);
        System.out.println();

        System.out.println("Total number of leaf nodes: " + bt.hitLeaf(bt.root));
    }
}
