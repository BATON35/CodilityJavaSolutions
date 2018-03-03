package com.ehr.codility._10_PrimeNumbers;

public class MinPerimeterRectangle {

    /*
    * https://app.codility.com/demo/results/trainingRG4T4U-PAY/
     */
    public static void main(String[] args) {
        int test = 36;

        MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();
        int result = minPerimeterRectangle.solution(test);
        System.out.println("Rectangle with area=" + test + " has minimal perimeter=" + result + ".");
    }

    public int solution(int N) {
        // write your code in Java SE 8
        int minPerimeter = Integer.MAX_VALUE;
        int curPerimeter = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 1; i * i <= N; i++) {
            if(N % i == 0) {
                int A = i;
                int B = N / i;
                curPerimeter = (A + B) * 2;
                minPerimeter = Math.min(minPerimeter, curPerimeter);
            }
        }
        return minPerimeter;
    }
}
