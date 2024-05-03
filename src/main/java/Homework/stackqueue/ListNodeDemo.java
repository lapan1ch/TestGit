package Homework.stackqueue;

import static Homework.stackqueue.ListNode.isSymmetric;

public class ListNodeDemo {

    public static void main(String[] args) {
        // Примеры тестов

        // Проверка симметричного списка
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(2);
        list1.next.next.next.next = new ListNode(1);

        // Проверка симметричного списка
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(3);
        list2.next.next.next.next = new ListNode(2);
        list2.next.next.next.next.next = new ListNode(1);

        // Проверка несимметричного списка
        ListNode list3 = new ListNode(1);
        list3.next = new ListNode(2);
        list3.next.next = new ListNode(3);
        list3.next.next.next = new ListNode(4);
        list3.next.next.next.next = new ListNode(3);
        list3.next.next.next.next.next = new ListNode(2);
        list3.next.next.next.next.next.next = new ListNode(1);

        System.out.println("Список 1 является симметричным: " + isSymmetric(list1));
        System.out.println("Список 2 является симметричным: " + isSymmetric(list2));
        System.out.println("Список 3 является симметричным: " + isSymmetric(list3));
    }
}


