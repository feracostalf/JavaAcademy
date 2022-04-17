package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionList {
    private static List<String> list=new ArrayList<>();

    public static void main(String[] args) {
        list.add("IBM");
        list.add("JAVA");
        list.add("ACADEMY");

        printList(list);

        String last= list.get(list.size()-1);
        System.out.println(last);

        list.remove(0);
        printList(list);

        String[] arr={"hugo","herrera"};
        List<String> name= Arrays.asList(arr);
        System.out.println(name);

        list.addAll(name);
        System.out.println(list);
    }

    private static void printList(List<String> list) {
        System.out.println(list);
    }
}
