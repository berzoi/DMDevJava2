package lesson18;

public class ListRunnerOld {

    public static void main(String[] args) {
        ListOld<String> list = new ListOld<>(10);
        list.add("String1");
        list.add("String2");
        list.add("String3");

        String element = list.get(1);
        System.out.println(element);
    }
}
