package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewForDemo {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three", "four", "five"};

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            System.out.println(s);
        }

        //增强for的使用
        for (String s : strings) {
            System.out.println(s);
        }

        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String c = iterator.next();
            System.out.println(c);
        }

        //增强for的使用
        for (String c : collection) {
            System.out.println(c);
        }

    }
}
