import java.util.HashMap;

public class BasicHashMap {

    public static void main(String[] args) {


        HashMap<String,Integer> hm= new HashMap<>();

        hm.put("Employee-1",101);// insertion
        hm.put("Employee-2",102);
        hm.put("Employee-3",103);
        hm.put("Employee-4",104);
        hm.remove("Employee-4");
        hm.get("Employee"); // will result null value.
        hm.size();// gives size of Hashmap
        hm.containsValue(101); // will get the boolean type
        System.out.println(hm);
    }
}
