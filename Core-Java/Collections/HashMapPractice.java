import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Aaditya", 90);
        marks.put("Rahul", 85);
        marks.put("Priya", 95);

        System.out.println(marks);
        System.out.println("Aaditya's Marks: " + marks.get("Aaditya"));
    }
}