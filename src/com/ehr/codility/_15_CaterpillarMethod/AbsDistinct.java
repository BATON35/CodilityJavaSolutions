package com.ehr.codility._15_CaterpillarMethod;

import java.util.HashSet;

public class AbsDistinct {
    public static void main(String[] args) {
        int[] test = new int[]{-3,-2,-1,0,1};

        AbsDistinct absDistinct = new AbsDistinct();
        System.out.println("The array has: " + absDistinct.solution(test));
    }


    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++) {
            set.add(Math.abs(A[i]));
        }

        return set.size();
    }
}
