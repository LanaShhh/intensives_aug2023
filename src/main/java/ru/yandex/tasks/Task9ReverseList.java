package ru.yandex.tasks;

public class Task9ReverseList {
    public static Node reverse (Node head) {
        /*
         * Разворот односвязного списка
         * head - голова списка
         * Выход: новая голова списка
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void selfCheck() {
        Node a1 = null;
        Node out1 = reverse(a1);
        assert out1 == null;

        Node a2 = new Node();
        a2.value = 0;
        a2.next = null;
        Node out2 = reverse(a2);
        assert (out2 == a2 && out2.next == null);

        Node a3 = new Node();
        Node b3 = new Node();
        Node c3 = new Node();
        a3.value = 4;
        a3.next = b3;
        b3.value = 5;
        b3.next = c3;
        c3.value = 6;
        c3.next = null;
        Node out3 = reverse(a3);
        assert (out3 == c3 && out3.value == 6 && out3.next == b3);
        out3 = out3.next;
        assert (out3 == b3 && out3.value == 5 && out3.next == a3);
        out3 = out3.next;
        assert (out3 == a3 && out3.value == 4 && out3.next == null);
    }

    public static void main(String[] args) {
        selfCheck();
    }
}
