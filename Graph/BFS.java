import java.util.*;

public class BFS {
    private int V;
    private LinkedList<Integer>[] adj;

    BFS(int v) {
        this.V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdges(int v, int e) {adj[v].add(e);}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BFS graph = new BFS(n);
        for(;;) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            if (v == -1 || e == -1) {break;}
            graph.addEdges(v, e);
        }
        int source = sc.nextInt();
        graph.bfs(source);
    }

    public void bfs(int source){
        boolean[] visited = new boolean[V];
        visited[source] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()) {
            source = q.poll();
            System.out.print(source + " ");
            for(int n : adj[source]){
                if(!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        } 
    }
}