package Homework;

public class OperationTwo {


    public static void main(String[] args) {
        int N = 10;
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }

    public static int sumOfDigits(int N) {
        if (N < 10) {
            return N;
        } else {
            return N % 10 + sumOfDigits(N / 10);
        }
    }
}