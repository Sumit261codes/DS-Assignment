import java.util.*;

public class DFSAdjList {
    static void dfs(int u, List<List<Integer>> adj, boolean[] vis){
        vis[u]=true; System.out.print(u+" ");
        for(int v: adj.get(u)) if(!vis[v]) dfs(v, adj, vis);
    }

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
        System.out.print("DFS: ");
        dfs(s, adj, vis);
        System.out.println();
        sc.close();
    }
}
