import java.util.*;

public class DFS {

    private static int V;
    private static LinkedList<Integer>[] adj;
    private static int count = 0;

    DFS (int v) { 
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public static void addEdge(int v, int e){
        adj[v].add(e);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] visited = new boolean[n];
        DFS graph = new DFS(n);
        int v,e;
        for (;;) {
            v = sc.nextInt();
            e = sc.nextInt();
            if (v == -1 || e == -1) {break;}
            addEdge(v, e);
        }
        printDFS(0, visited);
        System.out.println(count);
    }

    public static void printDFS(int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int i : adj[s]) {
            count++;
            if (!visited[i]) {
                printDFS(i, visited);
            }
        }
    }
}