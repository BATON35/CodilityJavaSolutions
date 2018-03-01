package com.ehr.codility._9_MaximumSliceProblem;

public class MaxDoubleSliceSum {
    /*
    https://app.codility.com/demo/results/trainingF69ESA-SE6/
    */
    public static void main(String[] args) {

        int[] test = new int[]{1,-2,-1,5,99};

        MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();
        int result = maxDoubleSliceSum.solution(test);
        System.out.println(result);

    }

    public int solution(int[] A) {
        int N = A.length;
        int[] K1 = new int[N];
        int[] K2 = new int[N];

        for(int i = 1; i < N-1; i++){
            K1[i] = Math.max(K1[i-1] + A[i], 0);
        }
        for(int i = N-2; i > 0; i--){
            K2[i] = Math.max(K2[i+1]+A[i], 0);
        }

        int max = 0;

        for(int i = 1; i < N-1; i++){
            max = Math.max(max, K1[i-1]+K2[i+1]);
        }

        return max;
    }
}

