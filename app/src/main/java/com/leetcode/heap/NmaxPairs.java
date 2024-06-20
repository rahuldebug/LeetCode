package com.leetcode.heap;

import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

public class NmaxPairs {
    public static void main(String[] args) {
        NmaxPairs nmaxPairs = new NmaxPairs();
        int A[] = {1, 4, 2, 3};
        int B[] = {2, 5, 1, 6};
        var result = nmaxPairs.solve(A,B);
        for (Integer i:result){
            System.out.println(i);
        }
    }

    public int[] solve(int[] A, int[] B) {
        int len=A.length;
        PriorityQueue<Data> pq =
                new PriorityQueue<Data>((o1, o2) -> o2.getSum() - o1.getSum());
        Arrays.sort(A);
        Arrays.sort(B);

        
        int result[] = new int[A.length];
        for (int k = 0; k < A.length; k++) {
            result[k] = pq.poll().getSum();
        }
        return result;
    }

    static class Data {
        Integer sum;
        Integer i;

        public Data(Integer sum, Integer i, Integer j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }

        Integer j;

        public Integer getSum() {
            return sum;
        }

        public void setSum(Integer sum) {
            this.sum = sum;
        }

        public Integer getI() {
            return i;
        }


        @Override
        public int hashCode() {
            return Objects.hash(getI(), getJ());
        }

        public void setI(Integer i) {
            this.i = i;
        }

        public Integer getJ() {
            return j;
        }

        public void setJ(Integer j) {
            this.j = j;
        }


    }
}
