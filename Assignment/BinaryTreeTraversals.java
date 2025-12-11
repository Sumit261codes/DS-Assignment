import java.util.*;

public class BinaryTreeTraversals {
    static class Node { int val; Node left,right; Node(int v){val=v;} }

    static Node buildLevelOrder(Scanner sc){
        int val = sc.nextInt();
        if(val==-1) return null;
        Node root = new Node(val);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(!sc.hasNext()) break;
            int l = sc.nextInt();
            if(l!=-1){ cur.left = new Node(l); q.add(cur.left); }
            if(!sc.hasNext()) break;
            int r = sc.nextInt();
            if(r!=-1){ cur.right = new Node(r); q.add(cur.right); }
        }
        return root;
    }

    static void preorder(Node n){ if(n==null) return; System.out.print(n.val+" "); preorder(n.left); preorder(n.right); }
    static void inorder(Node n){ if(n==null) return; inorder(n.left); System.out.print(n.val+" "); inorder(n.right); }
    static void postorder(Node n){ if(n==null) return; postorder(n.left); postorder(n.right); System.out.print(n.val+" "); }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter level-order nodes (use -1 for null). Example for tree with root 1 two children: 1 2 3 -1 -1 -1 -1");
        Node root = buildLevelOrder(sc);
        System.out.print("Preorder: "); preorder(root); System.out.println();
        System.out.print("Inorder: "); inorder(root); System.out.println();
        System.out.print("Postorder: "); postorder(root); System.out.println();
        sc.close();
    }
}
