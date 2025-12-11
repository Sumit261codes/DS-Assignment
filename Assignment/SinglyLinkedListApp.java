import java.util.*;

public class SinglyLinkedListApp {
    static class Node { int val; Node next; Node(int v){val=v;} }
    Node head;

    void insertStart(int v){ Node n=new Node(v); n.next=head; head=n; }
    void insertEnd(int v){
        Node n=new Node(v); if(head==null){ head=n; return; }
        Node cur=head; while(cur.next!=null) cur=cur.next; cur.next=n;
    }
    void insertAt(int pos,int v){
        if(pos<=0){ insertStart(v); return; }
        Node cur=head; int i=0;
        while(cur!=null && i<pos-1){ cur=cur.next; i++; }
        Node n=new Node(v);
        if(cur==null) insertEnd(v);
        else { n.next=cur.next; cur.next=n; }
    }
    void deleteStart(){ if(head!=null) head=head.next; }
    void deleteEnd(){
        if(head==null) return;
        if(head.next==null){ head=null; return; }
        Node cur=head; while(cur.next.next!=null) cur=cur.next; cur.next=null;
    }
    void deleteAt(int pos){
        if(head==null) return;
        if(pos<=0){ deleteStart(); return; }
        Node cur=head; int i=0;
        while(cur.next!=null && i<pos-1){ cur=cur.next; i++; }
        if(cur.next!=null) cur.next=cur.next.next;
    }
    boolean search(int v){ Node cur=head; while(cur!=null){ if(cur.val==v) return true; cur=cur.next; } return false; }
    void display(){ Node cur=head; while(cur!=null){ System.out.print(cur.val+" "); cur=cur.next; } System.out.println(); }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SinglyLinkedListApp list=new SinglyLinkedListApp();
        while(true){
            System.out.println("1 insStart 2 insEnd 3 insAt 4 delStart 5 delEnd 6 delAt 7 search 8 display 0 exit");
            int op=sc.nextInt();
            if(op==0) break;
            switch(op){
                case 1: list.insertStart(sc.nextInt()); break;
                case 2: list.insertEnd(sc.nextInt()); break;
                case 3: list.insertAt(sc.nextInt(), sc.nextInt()); break;
                case 4: list.deleteStart(); break;
                case 5: list.deleteEnd(); break;
                case 6: list.deleteAt(sc.nextInt()); break;
                case 7: System.out.println(list.search(sc.nextInt())); break;
                case 8: list.display(); break;
                default: System.out.println("Invalid"); 
            }
        }
        sc.close();
    }
}
