package practise;


import java.util.HashMap;
import java.util.Map;

public class Test {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                char temp = map.get(s.charAt(i));
                if (temp != t.charAt(i))
                    return false;
            } else {
                if (map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new Test().isIsomorphic("badc", "baba"));
//        System.out.println(new Test().isIsomorphic("egg", "add"));

    }

}
