package test3;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        List<String> strings = List.of("Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa");

        int counter = findCounterOfName(strings);
        System.out.println(counter);

    }

    public static String writeName() {
        scanner = new Scanner(System.in);
        System.out.println("Write name: ");
        return scanner.nextLine();
    }


    public static int findCounterOfName(List<String> strings) {
        int counter = 0;
        String name = writeName();
        for (String string : strings) {
            if (name.equalsIgnoreCase(string)) {
                counter++;
            }
        }
        if (counter == 0) {
            throw new RuntimeException("This name is absent.");
        }
        return counter;
    }
}




