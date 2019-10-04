package com.algorithms.hashmap;
//Return true if there is a distinct i and j
//such that arr[i] == arr[j] where the absolute
//difference of i and j is less than or equal to k.
import java.util.HashMap;
public class CloseNumbers {
    boolean containsCloseNums(int[] nums, int k) {
        HashMap<Integer, Integer> num_index = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(num_index.containsKey(nums[i])){
                int prev_index = num_index.get(nums[i]);
                if(i - prev_index <= k){
                    return true;
                }
            }
            num_index.put(nums[i], i);
        }
        return false;
    }

}
