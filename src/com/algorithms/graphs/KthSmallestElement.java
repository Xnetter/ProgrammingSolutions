package com.algorithms.graphs;
//Find the Kth Smallest Element in a Binary Tree
//Utilizes in-order-traversal
public class KthSmallestElement {
    public static int K;
    public static int finalVal = -1;
    int kthSmallestInBST(Tree<Integer> t, int k) {
        int[] numCont = new int[1];
        K = k;
        visit(t);
        return finalVal;
    }


    public static void visit(Tree<Integer> t){
        if(t.left != null)
            visit(t.left);
        K--;
        if(K == 0){
            finalVal = t.value;
            return;
        }
        if(t.right != null)
            visit(t.right);
    }
}
