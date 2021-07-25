package com.vrinceanuvladut.series;

/**
 * Created by Vrinceanu Vladut on 26-08-2020
 */
public class Series {
    private int n;

    public Series(int n) {
        this.n = n;
    }

    public static int nSum(int n) {
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
        return 0;
    }

    public static int factorial(int n) {
        if (n > 0) {
          int prod = 1;
          for(int i = 1; i<=n;i++){
              prod *= i;
          }
          return prod;

        }

        return 0;
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}


