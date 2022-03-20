package com.company;
import java.util.ArrayList;

class GraphDFS {
    int V; // No. of vertices
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    boolean[] visited;
    public static void main(String[] args) {// time comp : O(V+E)
        GraphDFS g=new GraphDFS(8);

        g.addEdge(0, 1);// first Graph
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);

        g.addEdge(4,5);// Second Graph
        g.addEdge(4,6);
        g.addEdge(5,7);
        g.DFS(g.V);
    }

    GraphDFS(int v) {// constructor
        V=v;
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        visited=new boolean[V];
    }
    void DFS(int v) {
        for(int i=0; i<v; i++){
            if(!visited[i])
                DFSrec(i);
        }
    }
    void DFSrec(int s) {
        visited[s]=true;
        System.out.print(s+" ");
        for(int i:adj.get(s)){
            if(!visited[i])
                DFSrec(i);
        }
    }
    void addEdge(int u,int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}



