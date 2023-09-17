package com.leetcode.arrays;

/*[2,3,4,5]

o/p product of array except itself

[60,40.30,24]

60= (3*4*5) i.e product of everything on right * everything * everything on right , since for the corner case it has to be considered as 1
40=(2)*(4*5)
30=(2*3)*(5)
24=(2*3*4)*(1)

the above mentioned multiplication can be achieved by multiplication

of product of array right[products] * left[product]
[1,1*2,1*2*3,1*2*3*4]
[1*5*4*3,1*5*4,1*5,1]
* */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] right = new int[len];
        int[] left = new int[len];

        right[len - 1] = 1;
        left[0] = 1;


        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int j = len - 2; j >= 0; j--) {
            right[j] = right[j + 1] * nums[j + 1];
        }
        int result[] = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = left[i] * right[i];
        }
        return result;

    }

}
