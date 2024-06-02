package pertemuan13;

public class BinaryTree14 {
    node14 root;

    BinaryTree14(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }

    void addRekurisif(int data) {
        root = addRekursif(root, data);
    }

    // Method rekursif untuk menambahkan node
    node14 addRekursif(node14 current, int data) {
        if (current == null) {
            return new node14(data);
        }

        if (data < current.data) {
            current.left = addRekursif(current.left, data);
        } else if (data > current.data) {
            current.right = addRekursif(current.right, data);
        }

        return current;
    }
    boolean find(int data){
        node14 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }
    
    void traversePreOrder(node14 node){
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(node14 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    void traverseInOrder(node14 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    
    node14 getSuccessor(node14 del){
        node14 successor = del.right;
        node14 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is Empty");
            return;
        }
        
        node14 parent = root;
        node14 current = root;
        boolean isLeftChild = false;
        
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        
        if (current == null) {
            System.out.println("Couldn't find data");
            return;
        }
        
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else {
            node14 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
        
    }
    // Method untuk menampilkan nilai paling kecil
    int findMin() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            node14 current = root;
            while (current.left != null) {
                current = current.left;
            }
            return current.data;
        }
    }

    // Method untuk menampilkan nilai paling besar
    int findMax() {
        if (isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            node14 current = root;
            while (current.right != null) {
                current = current.right;
            }
            return current.data;
        }
    }

    // Method untuk menampilkan data yang ada di leaf
    void printLeaf(node14 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }
            printLeaf(node.left);
            printLeaf(node.right);
        }
    }

    // Method untuk menampilkan jumlah leaf
    int hitLeaf(node14 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return hitLeaf(node.left) + hitLeaf(node.right);
    }
}

