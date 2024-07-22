package firstLessons;
import java.util.HashMap;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {
        Map<String, Integer> notes = new HashMap<>();
        //DEVE HAVER UNICIDADE QUANDO FOR USAR O hashmap
        notes.put("Pablo", 10);
        notes.put("Débora", 9);
        notes.put("Ellie", 8);
        /*
         * var note = notes.get("Débora");
         * System.out.println(note);
         */
        for (Map.Entry<String, Integer> entry : notes.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("O aluno(a) " + key + " recebeu a nota " + value);
        }
    }
}
