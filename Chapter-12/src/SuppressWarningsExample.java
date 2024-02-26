import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Creating a generic list without specifying its type argument
        List rawList = new ArrayList();

        // Adding elements to the raw list
        rawList.add("Java");
        rawList.add(42);

        // Unchecked warning due to the raw use of generic type
        List<String> stringList = (List<String>) rawList;

        // No warning here, but a ClassCastException at runtime
        String element = stringList.get(0);
        System.out.println(element);
        String element1 = stringList.get(1);
        System.out.println(element1);

        List<Integer> stringList1 = (List<Integer>) rawList;
        int element11 = stringList1.get(1);
        System.out.println(element11);

        System.out.println(rawList.get(0));
        System.out.println(rawList.get(1));
    }
}
