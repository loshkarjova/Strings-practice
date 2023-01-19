package test1;

import java.util.List;

public class Main {

    static StringBuilder stringBuilder;

    public static void main(String[] args) {
        List<String> names = List.of("brange", "plum", "tomato", "onibn", "grape");

        stringBuilder = new StringBuilder();
        getRightWords(names);
        System.out.println(stringBuilder);

    }

    public static void getRightWords(List<String> names) {
        int count = 1;
        for (String name : names) {
            stringBuilder.append(count).append(".").append(name.replace('b','o')).append("\n");
            count++;
        }
    }

}
