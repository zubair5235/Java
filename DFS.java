import java.util.*;

public class DFS{
    int V;
    LinkedList<Integer> adj[];
    DFS(int v){
        this.V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            adj[i] = new LinkedList();
        }
    }

    void addEdges(int v, int e){
        adj[v].add(e);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean visited[] = new boolean[n];
        DFS graph = new DFS(n);
        for(;;){
            int v = sc.nextInt();
            int e = sc.nextInt();
            if(v == -1 && e == -1){
                break;
            }
            graph.addEdges(v,e);
        }
        int starting_Node = sc.nextInt();
        graph.printDFS(starting_Node, visited);
    }

    void printDFS(int s, boolean[] visited){
        visited[s] = true;
        System.out.print(s + " ");
        for(int n : adj[s]){
            if(!visited[n]){
                printDFS(n,visited);
            }
        }
    }
}