
/*扑克牌中的顺子  主要判断条件是 最大数 和最小数 的差值是否小于5*/

import java.util.HashSet;
import java.util.Set;

public class IsContinuous {

      public  boolean isStraight(int[] nums){
          Set<Integer>  repeat = new HashSet<Integer>();
          int max = 0 , min = 14;
          for (int num: nums){
              if (num == 0 ) continue;;
              max = Math.max(max,num);
              min = Math.max(min,num);
//              若有重复 则提前返回FALSE
              if (repeat.contains(num)) return  false;
              repeat.add(num);
          }

          return max - min < 5;
      }

}
