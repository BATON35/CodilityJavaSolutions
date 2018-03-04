package com.ehr.codility._15_CaterpillarMethod;

/*
 * https://app.codility.com/demo/results/training8A68K8-EFA/
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountDistinctSlices {
    public static void main(String[] args) {
        int[] test = new int[]{10,10};

        /* some lambda test */
        Integer[] testIntegers = new Integer[test.length];
        for(int i = 0; i < testIntegers.length; i++) testIntegers[i] = test[i];
        int val = Integer.MIN_VALUE;
        List<Integer> list = Arrays.asList(testIntegers);
        Integer maxval = list.stream()
                                    .max(Comparator.comparing(i -> i))
                                    .get();
        System.out.println("MaxVal: " + maxval);
        /* end of lamda tests */


        /* find max val from input array */
        for (int x = 0; x < test.length; x++) {
            if (test[x] > val) {
                val = test[x];
            }
        }

        CountDistinctSlices countDistinctSlices = new CountDistinctSlices();
        int result = countDistinctSlices.solution(val, test);
        System.out.println("Result: " + result);
    }

    private int solution(int M, int[] A) {
        int N = A.length;
        if(N==1) return 1;
        if(N==0) return 0;
        boolean[] flag = new boolean[M+1];
        int left = 0;
        int right = 0;
        int counter = 0;

        while(left < N && right < N) {
            if(flag[A[right]] == false) {
                counter += (right - left + 1); // @+1 stands for possible of 1 element slice (i,i);
                if(counter >= 1000000000) return 1000000000;

                flag[A[right]] = true;
                right++;
            } else {
                flag[A[left]] = false;
                left++;
            }
        }
        return counter;
    }
}
