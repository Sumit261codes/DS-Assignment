import java.util.*;

public class CircularQueueApp {
    static class CircularQueue {
        int[] a; int head=0, tail=0, size=0;
        CircularQueue(int cap){ a=new int[cap]; }
        boolean isEmpty(){ return size==0; }
        boolean isFull(){ return size==a.length; }
        void push(int v){ if(isFull()) System.out.println("Full"); else { a[tail]=v; tail=(tail+1)%a.length; size++; } }
        int pop(){ if(isEmpty()){ System.out.println("Empty"); return Integer.MIN_VALUE; } int r=a[head]; head=(head+1)%a.length; size--; return r; }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Capacity: "); int cap=sc.nextInt();
        CircularQueue q=new CircularQueue(cap);
        while(true){
            System.out.println("1 push 2 pop 3 isEmpty 4 isFull 0 exit");
            int op=sc.nextInt(); if(op==0) break;
            if(op==1) q.push(sc.nextInt());
            else if(op==2) System.out.println("popped: "+q.pop());
            else if(op==3) System.out.println(q.isEmpty());
            else if(op==4) System.out.println(q.isFull());
        }
        sc.close();
    }
}
