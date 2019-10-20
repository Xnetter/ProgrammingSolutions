package com.algorithms.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
//Breadth first search with an arraylist representation of a graph.
public class BreadthFirstSearch {
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean[] vis, int nov)
    {
        LinkedList<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int currNode = q.poll();
            if(vis[currNode])
                continue;
            System.out.print(currNode + " ");
            vis[currNode] = true;
            q.addAll(list.get(currNode));
        }

    }
}
