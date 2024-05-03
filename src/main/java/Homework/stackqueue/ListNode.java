package Homework.stackqueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }


    public static boolean isSymmetric(ListNode head) {
        // Проверяем, пуст ли список
        if (head == null) return true; // Пустой список считается симметричным

        // Создаем стек и очередь для хранения элементов первой и второй половины списка соответственно
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        // Находим середину списка
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            queue.add(slow.val); // Первая половина списка заносится в очередь
            slow = slow.next;
            fast = fast.next.next;
        }

        // Пропускаем серединный элемент, если количество элементов списка нечетно
        if (fast != null) {
            slow = slow.next;
        }

        // Вторая половина списка заносится в стек
        while (slow != null) {
            stack.push(slow.val);
            slow = slow.next;
        }

        // Сравниваем элементы из стека и очереди
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false; // Несимметричность обнаружена
            }
        }

        // Если стек и очередь пусты, значит, список симметричен
        return stack.isEmpty() && queue.isEmpty();
    }

}
