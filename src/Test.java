
import java.util.*;

// 对人生欲望的挑战  抓住机会

// 人生 那种挑战的欲望

public class Test {
    HashMap<Character,char[]> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
            map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});
        char[]  digitsArr = digits.toCharArray();
        int len = digitsArr.length;
        List<char[]> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
             char ch = digitsArr[i];
             char[] values = map.get(ch);
               list.add(values);
        }
        int size = list.size();
        StringBuilder sb = new StringBuilder();
        for (char[] values:list){
            int l1 = values.length;
            for (int i = 0; i < l1; i++) {
//                sb.append(values[i])
            }

        }

    }




    public static void main(String[] args) {
       String s = " 3/2 ";
        int[] res = new int[]{4,-2,-3,4,1};
        Test test = new Test();
//      System.out.println(test.calculate(s));
    }

}








