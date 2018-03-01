package com.ehr.codility._9_MaximumSliceProblem;

public class MaxSliceSum {
    /*
    https://app.codility.com/demo/results/trainingQPGSBM-5EJ/
     */
    public static void main(String[] args) {

        int[] test = new int[]{1,-2,1,5};

        MaxSliceSum maxSliceSum = new MaxSliceSum();
        int result = maxSliceSum.solution(test);
        System.out.println(result);

    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int currentSum = A[0];
        int maximumSum = A[0];

        for(int i = 1; i < A.length; i++) {
            currentSum = Math.max(A[i], currentSum + A[i]);
            maximumSum = Math.max(currentSum, maximumSum);
        }
        return maximumSum;
    }
}
