import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat dog";

        String[] sarray = s.split(" ");


        HashMap<Character,String>  hm = new HashMap<>();

        HashMap<String,Character> hm2 = new HashMap<>();

        for (int i =0; i<pattern.length();i++){

            char c = pattern.charAt(i);
            String str = sarray[i];

            if (hm.containsKey(c)){
                if (!hm.get(c).equals(str)){
                    System.out.println(false);
                }
            }
            else {
                hm.put(c,str);

            }

            if (hm2.containsKey(str)){
                if (hm2.get(str)!=c){
                    System.out.println(false);
                }
            }
            else {
                hm2.put(str,c);
            }

        }

    }
}
