import java.util.*;

public class DoublyLinkedListApp {
    static class Node { int val; Node prev, next; Node(int v){val=v;} }
    Node head;
    void insertEnd(int v){
        Node n=new Node(v);
        if(head==null){ head=n; return; }
        Node cur=head; while(cur.next!=null) cur=cur.next;
        cur.next=n; n.prev=cur;
    }
    void displayForward(){
        Node cur=head; while(cur!=null){ System.out.print(cur.val+" "); cur=cur.next; } System.out.println();
    }
    void displayBackward(){
        if(head==null){ System.out.println(); return; }
        Node cur=head; while(cur.next!=null) cur=cur.next;
        while(cur!=null){ System.out.print(cur.val+" "); cur=cur.prev; } System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DoublyLinkedListApp dll=new DoublyLinkedListApp();
        System.out.print("How many nodes? ");
        int n=sc.nextInt();
        System.out.println("Enter values:");
        for(int i=0;i<n;i++) dll.insertEnd(sc.nextInt());
        System.out.print("Forward: "); dll.displayForward();
        System.out.print("Backward: "); dll.displayBackward();
        sc.close();
    }
}
