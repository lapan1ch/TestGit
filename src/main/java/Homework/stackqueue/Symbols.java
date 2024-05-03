package Homework.stackqueue;
import java.util.Stack;
public class Symbols {


    public static void main(String[] args) {

        String sequence1 = "([{}])";
        String sequence2 = "([)]";
        String sequence3 = "{()}";

        // Проверяем корректность последовательностей скобок
        System.out.println(sequence1 + " " + (isValid(sequence1) ? "является правильной последовательностью" : "не является правильной последовательностью"));
        System.out.println(sequence2 + " " + (isValid(sequence2) ? "является правильной последовательностью" : "не является правильной последовательностью"));
        System.out.println(sequence3 + " " + (isValid(sequence3) ? "является правильной последовательностью" : "не является правильной последовательностью"));
    }

    public static boolean isValid(String s) {
        // Создаем стек для хранения открывающих скобок
        Stack<Character> stack = new Stack<>();

        // Проходим по строке с последовательностью скобок
        for (char bracket : s.toCharArray()) {
            // Если символ является открывающей скобкой, помещаем его в стек
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                // Если символ является закрывающей скобкой
                // Проверяем, соответствует ли он последней открывающей скобке в стеке
                if (stack.isEmpty()) {
                    return false; // Нет соответствующей открывающей скобки
                }

                char last = stack.peek();
                if (bracket == ')' && last != '(' ||
                        bracket == ']' && last != '[' ||
                        bracket == '}' && last != '{') {
                    return false; // Неверная последовательность скобок
                }
                // Удаляем последнюю открывающую скобку из стека
                stack.pop();
            }
        }
        // Проверяем, остались ли непарные скобки
        return stack.isEmpty();
    }
}
