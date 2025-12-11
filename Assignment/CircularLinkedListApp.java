import java.util.*;

public class CircularLinkedListApp {
    static class Node { int val; Node next; Node(int v){val=v;} }
    Node tail; // tail.next is head

    void insertEnd(int v){
        Node n=new Node(v);
        if(tail==null){ tail=n; tail.next=tail; return; }
        n.next=tail.next; tail.next=n; tail=n;
    }
    void display(){
        if(tail==null){ System.out.println(); return; }
        Node cur=tail.next;
        do{ System.out.print(cur.val+" "); cur=cur.next; } while(cur!=tail.next);
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CircularLinkedListApp cll=new CircularLinkedListApp();
        System.out.print("How many nodes? ");
        int n=sc.nextInt();
        System.out.println("Enter values:");
        for(int i=0;i<n;i++) cll.insertEnd(sc.nextInt());
        System.out.print("Circular List: "); cll.display();
        sc.close();
    }
}
