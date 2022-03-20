package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

        List<Integer> sourceList = List.of(3, 4, 5, 6);
        List<Integer> list = new ArrayList<>(sourceList);

        for (Integer integer : list) {
            if( list.get(integer) == 2){
                list.remove(integer);
            }
            System.out.println(list);

        }

    }


}

