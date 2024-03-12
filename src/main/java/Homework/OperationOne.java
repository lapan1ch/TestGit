package Homework;

import java.util.Scanner;

public class OperationOne {

    public static void main(String[] args) {
        int N = 16;

        if (isPowerOfTwo(N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    // Метод для проверки, является ли число точной степенью двойки
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
