package Homework;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Анна";
        if (isPalindrome(str)) {
            System.out.println(str + " - это палиндром");
        } else {
            System.out.println(str + " - это не палиндром");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length() - 1));

        }
    }
    }


