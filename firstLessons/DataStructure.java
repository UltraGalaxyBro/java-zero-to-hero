package firstLessons;
import java.util.ArrayList;
import java.util.List;

public class DataStructure {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Pablo");
        names.add("Débora");
        names.add("Ellie");
        // 0 -
        // 1 -
        // 2 -

        // System.out.println(names.get(0));
       /*  for (String name : names) {
            System.out.println("O nome é " + name);
        } */

       //names.forEach(name -> System.out.println("O nome é " + name));

       names.forEach(System.out::println);
    }
}
