package main.javacore.andrey.task;

import java.util.ArrayDeque;

public class SecondTask {
    public static void main(String[] args) {
        String in = "({}[]())";
        validateBrackets(in);
    }
    public static boolean validateBrackets(String input) {
        boolean res = true;
        byte[] b = input.getBytes();
        ArrayDeque<Byte> arrayDeque = new ArrayDeque<Byte>();
        for (Byte c : b) {
            arrayDeque.push(c);
        }
        if (arrayDeque.size() % 2 == 0) {
            while (arrayDeque.peek() != null) {
                if (arrayDeque.pollFirst() - arrayDeque.pollLast() > 5) {
                    res = false;
                    break;
                }
            }
            if (res == true) {
                System.out.println("Коректно");
            } else
                System.out.println("Не коректно");
        } else System.out.println("Не коректно");

        return true;
    }
}
