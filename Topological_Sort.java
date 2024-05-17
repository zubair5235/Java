import java.util.*;

public class Topological_Sort{
    int V;
    LinkedList<Integer> adj[];
    Topological_Sort(int v){
        this.V = v;
        this.adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            this.adj[i] = new LinkedList();
        }
    }

    void addEdges(int v, int e){
        adj[v].add(e);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Topological_Sort graph = new Topological_Sort(n);
        for(;;){
            int v = sc.nextInt();
            int e = sc.nextInt();
            if(v == -1 && e == -1){
                break;
            }
            graph.addEdges(v, e);
        }
        graph.sort();
    }

    void sort(){
        Stack<Integer> s = new Stack<Integer>();
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                sortRec(s, visited, i);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

    void sortRec(Stack<Integer> s, boolean[] visited, int i){
        visited[i] = true;
        for(int n : adj[i]){
            if(!visited[n]){
                sortRec(s, visited, n);
            }
        }
        s.push(i);
    }
}