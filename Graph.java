import java.io.*;
import java.util.*;

public class Graph{
    private int V;
    private LinkedList<Integer> adj[];
    Graph(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            adj[i] = new LinkedList();
        }
    }
    public void addEdge(int v,int e){
        adj[v].add(e);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graph g = new Graph(n);
        int v,e;
        while(true){
            v = sc.nextInt();
            e = sc.nextInt();
            if(v == -1 && e == -1){
                break;
            }
            g.addEdge(v,e);
        }
    }
}