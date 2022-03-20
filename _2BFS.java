package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//import java.util.*;

class GraphBFS {
    int V; // No. of vertices
    ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
    boolean[] visited;
    public static void main(String[] args) {// time comp : O(V+E)
        GraphBFS g=new GraphBFS(8);

        g.addEdge(0, 1);// first Graph
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);

        g.addEdge(4,5);// Second Graph
        g.addEdge(4,6);
        g.addEdge(5,7);
        g.BFSfun(g.V);
    }

    GraphBFS(int v){// constructor
        V=v;
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        visited=new boolean[V];
    }
    void BFSfun(int v){
        for(int i=0; i<v; i++){
            if(!visited[i])// visited[i]==false
                BFS(i);
        }
    }
    void BFS(int s){
        Queue<Integer> q= new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty()){
            int u=q.poll();// Retrieve and Remove the head of Queue, or return null if Queue is empty
            System.out.print(u+" ");
            for(int v:adj.get(u)){
                if(!visited[v]){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
    }
    void addEdge(int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}