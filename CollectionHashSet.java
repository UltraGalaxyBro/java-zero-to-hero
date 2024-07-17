import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(48);
        numbers.add(13);
        numbers.add(10);
        numbers.add(77);
        numbers.add(1457);
        numbers.add(1457);

        // numbers.remove(77);
        /*
         * int size = numbers.size();
         * System.out.println(size);
         */

        for (Integer item : numbers) {
            System.out.println(item + ". A quantidade de caracteres é " +
                    String.valueOf(item).length());
        }

        // System.out.println(numbers.contains(10));
    }
}
