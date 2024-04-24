package Homework;

public class Alphabet {
    public static void main(String[] args) {
        String input = "poiuytrewqlkjhgfdsamnbvcxz";
        String sortedOutput = sortString(input);
        System.out.println(sortedOutput);
    }

    public static String sortString(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int mid = s.length() / 2;
        String left = s.substring(0, mid);
        String right = s.substring(mid);
        String sortedLeft = sortString(left);
        String sortedRight = sortString(right);
        return merge(sortedLeft, sortedRight);
    }

    public static String merge(String left, String right) {
        StringBuilder result = new StringBuilder();
        int leftPtr = 0, rightPtr = 0;
        while (leftPtr < left.length() && rightPtr < right.length()) {
            if (left.charAt(leftPtr) < right.charAt(rightPtr)) {
                result.append(left.charAt(leftPtr++));
            } else {
                result.append(right.charAt(rightPtr++));
            }
        }
        while (leftPtr < left.length()) {
            result.append(left.charAt(leftPtr++));
        }
        while (rightPtr < right.length()) {
            result.append(right.charAt(rightPtr++));
        }
        return result.toString();
    }
}