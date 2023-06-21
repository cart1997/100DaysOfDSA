import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";

        HashMap<Character, Character> IsoStr = new HashMap<>();
        HashMap<Character, Character> IsoStr1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (IsoStr.containsKey(s.charAt(i))) {
                if (IsoStr.get(s.charAt(i)) != t.charAt(i)) {
                    System.out.println(false);
                }
            }
            else {
                IsoStr.put(s.charAt(i), t.charAt(i));
            }
            if (IsoStr1.containsKey(t.charAt(i))) {
                if (IsoStr1.get(t.charAt(i)) != s.charAt(i)) {
                    System.out.println(false);
                }
            }
            else {
                IsoStr1.put(t.charAt(i), s.charAt(i));
            }
        }
        System.out.println(IsoStr);
    }
}