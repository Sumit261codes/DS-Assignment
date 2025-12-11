import java.util.*;

public class BSTApp {
    static class Node { int val; Node left,right; Node(int v){val=v;} }
    Node root;

    void insert(int v){ root = insertRec(root, v); }
    Node insertRec(Node node,int v){
        if(node==null) return new Node(v);
        if(v < node.val) node.left = insertRec(node.left, v);
        else node.right = insertRec(node.right, v);
        return node;
    }

    boolean search(int v){ return searchRec(root, v); }
    boolean searchRec(Node node,int v){
        if(node==null) return false;
        if(node.val==v) return true;
        if(v < node.val) return searchRec(node.left, v);
        return searchRec(node.right, v);
    }

    void delete(int v){ root = deleteRec(root, v); }
    Node deleteRec(Node node,int v){
        if(node==null) return null;
        if(v < node.val) node.left = deleteRec(node.left, v);
        else if(v > node.val) node.right = deleteRec(node.right, v);
        else {
            if(node.left==null) return node.right;
            else if(node.right==null) return node.left;
            node.val = minValue(node.right);
            node.right = deleteRec(node.right, node.val);
        }
        return node;
    }
    int minValue(Node node){ while(node.left!=null) node=node.left; return node.val; }

    void inorder(Node n){ if(n==null) return; inorder(n.left); System.out.print(n.val+" "); inorder(n.right); }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BSTApp bst = new BSTApp();
        System.out.println("Enter numbers to insert into BST (end with -1):");
        while(true){
            int v=sc.nextInt(); if(v==-1) break; bst.insert(v);
        }
        System.out.print("Inorder (sorted): "); bst.inorder(bst.root); System.out.println();

        System.out.println("Operations: 1 search 2 delete 0 exit");
        while(true){
            int op=sc.nextInt(); if(op==0) break;
            if(op==1) System.out.println("Found: "+bst.search(sc.nextInt()));
            else if(op==2){ bst.delete(sc.nextInt()); System.out.print("Inorder: "); bst.inorder(bst.root); System.out.println(); }
        }
        sc.close();
    }
}
