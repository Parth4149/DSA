package com.company;
import java.util.ArrayList;
// Detect Cycle in Directed Graph
class DirectedGraph {
    public static void main(String[] args) {
        DirectedGraph g=new DirectedGraph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,1);
        boolean ans=g.DFS(g.V);
        System.out.println(ans);
    }

    int V;
    ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
    boolean[] visited,recSt; // recSt means recursion stack boolean array
    DirectedGraph(int v){// Constructor
        V=v;
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<Integer>());
        }
        visited=new boolean[V];// initialize , by default all elements are false(0)
        recSt=new boolean[V];
    }

    boolean DFS(int v){
        for(int i=0; i<v; i++){
            if(!visited[i]){        //visited[i]==false
                if(DFSrec(i))
                    return true;
            }
        }
        return false;
    }
    boolean DFSrec(int s){
        visited[s]=true;
        recSt[s]=true;
        for(int u: adj.get(s)){
            if(!visited[u] && DFSrec(u)){
                return true;// DFSrec(u) is equal DFSrec(u)==true
            }
            else if(recSt[u])
                return true;//  it detects cycle if it is true
        }
        recSt[s]=false;
        return false;
    }
    void addEdge(int u,int v){
        adj.get(u).add(v);
    }
}