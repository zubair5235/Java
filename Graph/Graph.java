import java.util.*;

public class Graph {

    private static int V;
    private static LinkedList<Integer>[] adj;
    private static int count = 0;

    Graph (int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public static void addEdge(int v, int e) {
        adj[v].add(e);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graph graph = new Graph(n);
        int v, e;
        for (;;) {
             v = sc.nextInt();
             e = sc.nextInt();
             if (v == -1 || e == -1) {break;}
             addEdge(v, e);
        }
        print(0);
        System.out.println(count);
    }

    public static void print(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            s = q.poll();
            if(s == 4) {break;}
            count++;
            System.out.print(s + " ");
            for (int i : adj[s]) {
                if(!visited[i]) {visited[i] = true; q.add(i);}
            }
        }
    }
}