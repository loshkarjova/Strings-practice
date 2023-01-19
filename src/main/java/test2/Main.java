package test2;

import java.util.List;

public class Main {
    static StringBuilder stringBuilder;

    public static void main(String[] args) {
        List<String> names = List.of("orange", "plum", "tomato", "onion", "grape");

        stringBuilder = new StringBuilder();
        deleteString(names);
        System.out.println(stringBuilder);
    }

    public static void deleteString(List<String> names) {
        int count = 1;
        for (String name : names) {
            if (name.equalsIgnoreCase("onion")) {
                stringBuilder.delete(names.indexOf(name), names.lastIndexOf(name));
            } else {
                stringBuilder.append(count).append(".").append(name).append("\n");
                count++;
            }
        }
    }
}


