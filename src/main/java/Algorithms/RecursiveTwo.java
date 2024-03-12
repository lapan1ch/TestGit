package Algorithms;

public class RecursiveTwo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int finalSum = recursiveSum(array, 0);
        System.out.println(finalSum);
        int finalSumFact = badFactorialFunction(1);
        System.out.println(finalSumFact);
    }

        public static int recursiveSum(int[] array, int index){
            if (index >= array.length){
                return 0;
            } else {
                return array[index] + recursiveSum(array,index + 1);
            }
        }


    public static int factorialFunction(int sum) {
        if (sum == 0) {
            return 1;
        } else {
            return  sum + factorialFunction(sum - 1);
        }

    }

    public static int badFactorialFunction(int sum) {
        if (sum == 0){
            return 1;
        } else{
            return sum + badFactorialFunction(sum + 1);
        }
    }

}
