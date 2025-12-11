import java.util.*;

public class ArrayStackApp {
    static class ArrayStack {
        int[] data; int top=-1;
        ArrayStack(int cap){ data=new int[cap]; }
        boolean isEmpty(){ return top==-1; }
        boolean isFull(){ return top==data.length-1; }
        void push(int v){ if(isFull()) System.out.println("Full"); else data[++top]=v; }
        int pop(){ if(isEmpty()){ System.out.println("Empty"); return Integer.MIN_VALUE; } return data[top--]; }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Capacity: "); int cap=sc.nextInt();
        ArrayStack st=new ArrayStack(cap);
        while(true){
            System.out.println("1 push 2 pop 3 isEmpty 4 isFull 0 exit");
            int op=sc.nextInt();
            if(op==0) break;
            if(op==1) st.push(sc.nextInt());
            else if(op==2) System.out.println("popped: "+st.pop());
            else if(op==3) System.out.println(st.isEmpty());
            else if(op==4) System.out.println(st.isFull());
        }
        sc.close();
    }
}
