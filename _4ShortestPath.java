package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//Shortest path in an Unweighted Graph
class ShortestPath {
    public static void main(String[] args) {
        ShortestPath s=new ShortestPath(4);
        s.addEdge(0,1);
        s.addEdge(0,2);
        s.addEdge(1,2);
        s.addEdge(1,3);
        s.addEdge(2,3);

        s.path(0);
    }

    int V;
    ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
    boolean[] visited;
    int[] dist;
    ShortestPath(int v){// Constructor
        V=v;
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<Integer>());
        }
        dist=new int[V];// initialize , by default all elements are 0
        visited=new boolean[V];// initialize , by default all elements are false(0)
    }

    void path(int s){// BFS

        Queue<Integer> q=new LinkedList<Integer>();
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v:adj.get(u)){
                if(!visited[v]){
                    dist[v]=dist[u]+1;
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
        for(int i:dist)
            System.out.print(i+" ");

    }
    void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
