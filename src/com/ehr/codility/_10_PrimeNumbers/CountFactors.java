package com.ehr.codility._10_PrimeNumbers;

public class CountFactors {

    /*
    * This solution has time complexity O(sqrt(N))
    * TO DO:
    * find time complex O(logN)
     */
    public static void main(String[] args) {
        int test = 36;

        CountFactors countFactors = new CountFactors();
        int result = countFactors.solution(test);
        System.out.println("Number " + test + " has " + result + " factors.");
    }

    public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
        for(int i = 1; i * i <= N; i++) {
            if(N % i == 0) result += 2;
        }

        int sqrtN = (int)Math.sqrt(N);
        if( sqrtN * sqrtN == N) result--;

        return result;
    }
}
