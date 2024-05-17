import java.util.*;

public class BFS{
    int V;
    LinkedList<Integer> adj[];
    BFS(int v){
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
        BFS graph = new BFS(n);
        for(;;){
            int v = sc.nextInt();
            int e = sc.nextInt();
            if(v == -1 && e == -1){
                break;
            }
            graph.addEdges(v,e);
        }

        int starting_Node = sc.nextInt();
        graph.print_BFS(starting_Node);
    }

    void print_BFS(int s){
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while(!q.isEmpty()){
            s = q.poll();
            System.out.print(s + " ");
            for(int n : adj[s]){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }
}