package Homework;

import java.util.Scanner;

public class OperationOne {

    public static void main(String[] args) {
        int N = 8;

        if (isPowerOfTwo(N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }


    public static boolean isPowerOfTwo(int N) {
        while (N > 1) {
            if (N % 2 != 0) {
                return false;
            }
            N /= 2;
        }
        return N == 1;
    }
}
