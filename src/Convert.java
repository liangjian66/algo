import java.util.ArrayList;
import java.util.List;

public class Convert {

    public  String convert(String s,int numRows){
        if (numRows<2) return  s;
        List<StringBuilder>  rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
             rows.add(new StringBuilder());
        }
        int i = 0;
        int falg = -1;
        for (char c:s.toCharArray()){
            rows.get(i).append(c);
            if (i==0|| i == numRows-1)  falg = -falg;
            i+=falg;

        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row:rows){
            res.append(row);
        }
        return  res.toString();
    }
}
