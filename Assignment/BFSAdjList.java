import java.util.*;

public class BFSAdjList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of vertices: ");
        int V=sc.nextInt();
        System.out.print("Number of edges: ");
        int E=sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());

        System.out.println("Enter edges (u v) zero-indexed:");
        for(int i=0;i<E;i++){
            int u=sc.nextInt(), v=sc.nextInt();
            adj.get(u).add(v);
            // if undirected: adj.get(v).add(u);
        }

        System.out.print("Start vertex: ");
        int s=sc.nextInt();

        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        vis[s]=true; q.add(s);
        System.out.print("BFS: ");
        while(!q.isEmpty()){
            int u=q.poll(); System.out.print(u+" ");
            for(int w: adj.get(u)){
                if(!vis[w]){ vis[w]=true; q.add(w); }
            }
        }
        System.out.println();
        sc.close();
    }
}
