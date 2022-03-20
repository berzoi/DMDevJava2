package lesson19.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Написать метод, который принимает целочисленный список и возвращает
 * целочисленный список только с нечетными значениями.
 */

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 6, 9, 10, 12);
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 9, 10, 12));
//        List<Integer> list = Arrays.asList(1, 3, 6, 9, 10, 12);
        List<Integer> result = removeEven(list);
        System.out.println(result);
    }

    private static List<Integer> removeEven(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if(value %2 != 0){
                result.add(value);
            }
        }
        return result;
    }
}
/**
 *   Arrays.asList si List.of fac return ImmutableCollections - adica nu putem adauga sau elimina elemente
 */
