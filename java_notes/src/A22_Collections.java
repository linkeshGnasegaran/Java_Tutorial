// Collections Framework
import java.util.*;

public class A22_Collections {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Volvo");
        list.add("BMW");
        list.add("Ford");

        System.out.println("Car List: " + list);

        Collections.sort(list);
        System.out.println("Sorted Cars: " + list);
    }
}
