package Homework;

public class Alphabet {
    public static void main(String[] args) {
        String input = "poiuytrewqlkjhgfdsamnbvcxz";
        String sortedOutput = sortString(input);
        System.out.println(sortedOutput);
    }

    public static String sortString(String s) {
        // Базовый случай: если длина строки меньше или равна 1, вернуть строку
        if (s.length() <= 1) {
            return s;
        }

        // Находим середину строки
        int mid = s.length() / 2;

        // Разделяем строку на две части
        String left = s.substring(0, mid);
        String right = s.substring(mid);

        // Рекурсивно сортируем каждую половину
        String sortedLeft = sortString(left);
        String sortedRight = sortString(right);

        // Объединяем и сортируем две отсортированные части
        return merge(sortedLeft, sortedRight);
    }

    // Метод для слияния и сортировки двух строк
    public static String merge(String left, String right) {
        StringBuilder result = new StringBuilder();
        int leftPtr = 0, rightPtr = 0;

        // Пока указатели не достигнут конца хотя бы одной из строк
        while (leftPtr < left.length() && rightPtr < right.length()) {
            // Сравниваем символы в двух строках и добавляем меньший в результирующую строку
            if (left.charAt(leftPtr) < right.charAt(rightPtr)) {
                result.append(left.charAt(leftPtr++));
            } else {
                result.append(right.charAt(rightPtr++));
            }
        }

        // Добавляем оставшиеся символы из левой и правой строки, если они есть
        while (leftPtr < left.length()) {
            result.append(left.charAt(leftPtr++));
        }

        while (rightPtr < right.length()) {
            result.append(right.charAt(rightPtr++));
        }

        return result.toString();
    }
}
