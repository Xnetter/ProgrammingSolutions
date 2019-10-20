package com.algorithms.graphs;

import java.util.ArrayList;
//Given a graph representation as an array list.
public class DepthFirstSearch {
    public static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean[] vis)
    {
        if(!vis[src]){
            System.out.print(src + " ");
            vis[src] = true;
            ArrayList<Integer> adj = list.get(src);
            for(int x : adj){
                dfs(x, list, vis);
            }
        }
    }
}
