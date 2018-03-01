package com.ehr.codility._8_Leader;

public class Dominator {

    /*
    https://app.codility.com/demo/results/trainingKASNWB-ZTV/
     */

    public static void main(String[] args) {
        int[] test = new int[]{1,2,2,42,2,4,2};

        Dominator dominator = new Dominator();
        int result = dominator.solution(test);
        System.out.println("Index of The dominator is:");
        System.out.println(result);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int count = 0;
        int value = 0;

        for (int i = 0; i < N; i++) {
            if (count == 0) {
                value = A[i];
                count++;
            } else if (A[i] == value) {
                count++;
            } else {
                count--;
            }
        }

        int result = -1;
        count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == value) {
                count++;
                result = i;
            }
        }

        if (count > N / 2) return result;
        else return -1;
    }
}
    /*
    public  int solution(int[] array) {

    int candidate=0;
    int counter = 0;

    // Find candidate for leader
    for(int i=0; i<array.length; i++){

        if(counter == 0) candidate = i;

        if(array[i] == array[candidate]){
            counter++;
        }else {
            counter--;
        }
    }

    // Count candidate occurrences in array
    counter = 0;
    for(int i=0; i<array.length; i++){
        if(array[i] == array[candidate]) counter++;
    }

    // Check that candidate occurs more than array.lenght/2
    return counter>array.length/2 ? candidate : -1;
     }
    */
