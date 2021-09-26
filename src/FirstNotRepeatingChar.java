import java.util.HashMap;

public class FirstNotRepeatingChar {

    public  static  char firstUniqChar(String s){
        HashMap<Character,Boolean> dict = new HashMap<Character, Boolean>();
        char[] sc = s.toCharArray();

        for (char c :sc){
            dict.put(c,!dict.containsKey(c));
        }

        for (char c:sc){
            if (dict.get(c))
                return  c;
        }
        return ' ';

    }
}
