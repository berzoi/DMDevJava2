package map;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("bbb");
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");

        System.out.println(set);
        set.forEach(System.out::println);
    }
}
