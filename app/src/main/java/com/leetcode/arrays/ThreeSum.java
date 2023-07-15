package com.leetcode.arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        //check for boundary
//        if (nums.length == 0 || nums == null) {
//            return ans;
//        }
//        Arrays.sort(nums);
//        for (int val = 0; val < nums.length - 2; val++) {
//            if (val > 0 && nums[val] == nums[val - 1]) continue;
//            int low = val + 1;
//            int high = nums.length - 1;
//            while (high > low) {
//                if (nums[val] + nums[low] + nums[high] == 0) {
//                    ans.add(Arrays.asList(nums[val], nums[low], nums[high]));
//                    while (nums[low] == nums[low + 1] && low < high) {
//                        low++;
//                    }
//                    while (nums[high] == nums[high - 1] && low < high) {
//                        high--;
//                    }
//                }
//                if ((nums[val] + (nums[low] + nums[high]) < 0)) {
//                    low++;
//                }
//                if ((nums[val] + (nums[low] + nums[high])) > 0) {
//                    high--;
//                }
//            }
//        }
//
//        return ans;
//    }


        {
            Arrays.sort(nums);
            //   List<List<Integer>> result= new LinkedList<>();
            HashSet<List<Integer>> result = new HashSet<>();

            for (int i = 0; i < nums.length - 2; i++) {

                // if (i==0||(i>0 && nums[i]!=nums[i-1])){
                int low = i + 1;
                int high = nums.length - 1;
                int val = 0 - nums[i];
                while (high > low) {
                    if (nums[high] + nums[low] == val) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                     /*   if (high>low &&  nums[low]==nums[low+1])low++;
                        if (high>low &&  nums[high]==nums[high-1])high--;
                       */
                        low++;
                        high--;

                    } else if (nums[high] + nums[low] > val) {
                        high--;
                    } else {
                        low++;
                    }
                    //  }

                }
            }
            return new LinkedList<List<Integer>>(result);
        }
    }
}
