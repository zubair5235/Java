import java.util.*;

public class Main{
    class Edge{
        int src, dest, weight;
        Edge(){
            src = dest = weight = 0;
        }
    }
    int V, E;
    Edge edge[];
    Main(int v, int e){
        V = v;
        E = e;
        edge = new Edge[e];
        for(int i = 0; i < e; i++){
            edge[i] = new Edge();
        }
    }

    void bellman(Main graph, int src){
        int V = graph.V;
        int E = graph.E;
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for(int i = 1; i < V; ++i){
            for(int j = 0; j < E; ++j){
                int u = graph.edge[j].src;
                int v = graph.edge[j].dest;
                int weight = graph.edge[j].weight;
                if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]){
                    dist[v] = dist[u] + weight;
                }  
            }
        }
        
        System.out.println("Vertex\tDistance from source");

        for(int i = 0; i < V; ++i){
            System.out.print(i + "\t");
            if(dist[i] != Integer.MAX_VALUE){
                System.out.println(dist[i]);
            }
            else{
                System.out.println(-1);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        Main graph = new Main(V, E);
        for(int i = 0; i < E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.edge[i].src = u;
            graph.edge[i].dest = v;
            graph.edge[i].weight = w;
        }
        graph.bellman(graph, 0);
    }
}