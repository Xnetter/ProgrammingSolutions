package com.algorithms.stringsandarrays;

import java.util.ArrayList;

public class MergeIntervals {
    //If a set of intervals overlap, merge them, and return a new matrix
    //with the newly merged intervals.
    public static ArrayList<ArrayList<Integer>> merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> newIntervals = new ArrayList<ArrayList<Integer>>();
        for(int[] arr : intervals){
            ArrayList<Integer> miniInterval = new ArrayList<Integer>();
            for(int x : arr){
                miniInterval.add(x);
            }
            newIntervals.add(miniInterval);
        }
        for(int i = 0; i < newIntervals.size()-1; i++){
            for(int j = i+1; j < newIntervals.size(); j++){
                int firstOfSecond = newIntervals.get(j).get(0);
                int firstOfFirst = newIntervals.get(i).get(0);
                int secondOfFirst = newIntervals.get(i).get(1);
                int secondOfSecond = newIntervals.get(j).get(1);
                if(firstOfSecond <= secondOfFirst && firstOfSecond >= firstOfFirst){
                    ArrayList<Integer> newEntry = new ArrayList<Integer>();
                    newEntry.add(firstOfFirst);
                    newEntry.add(secondOfSecond);
                    newIntervals.remove(j);
                    newIntervals.remove(i);
                    newIntervals.add(i, newEntry);
                    j = i;
                }
            }
        }
        return newIntervals;
    }
}
