package com.leetcode.arrays;
/*AirbnbAmazonGoldman Sachs
Problem Statement
Given an array arr of n positive elements. Return the pairs in sorted order (in case of the same first element sort on the basis of the second element) whose sum already exists in the given array.

You should form pairs such that the first element of the pair has a lower index in the array arr than the second element.

Example 1:
Sample Input

Arr = [10, 4, 8, 13, 5]



Sample Output

[[8, 5]]



Explanation : (Sum of 8 and 5 i.e 13 is present in the array)

Note: 8 comes before 5 in output because 8 is before 5 in input.*/
import java.util.*;

public class FindAllPairsInArray {
    public static void main(String[] args) {
       // 10

        int[] Arr = {1, 9, 1,0 ,8, 2, 2, 10, 7 ,9, 1};
        FindAllPairsInArray findAllPairsInArray = new FindAllPairsInArray();
        List<List<Integer>> result = findAllPairsInArray.findPair(Arr);
        result.stream().forEach(System.out::println);
    }

    public List<List<Integer>> findPair(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> check = new HashSet<>();
        for (int num : arr) {
            check.add(num);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (check.contains(arr[i] + arr[j])) {
                    ArrayList<Integer> temp = new ArrayList();
                    // if (i < j) {
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    //  } else {
                    //      temp.add(arr[j]);
                    //    temp.add(arr[i]);
                    //   }
                    result.add(temp);
                }
            }
        }
        result.sort((a, b) -> a.get(0) - b.get(0) != 0 ? a.get(0) - b.get(0) : a.get(1) - b.get(1));
        //  return result.sort((a, b) -> a.get(0) - b.get(0) != 0 ? a.get(0) - b.get(0) : a.get(1) - b.get(1));
        return result;
    }
}
