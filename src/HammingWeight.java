/*没搞懂  有时间再看*/

public class HammingWeight {

        public int hammingWeight(int n) {
            int ret = 0;
            while (n != 0) {
                n &= n - 1;
                ret++;
            }
            return ret;
        }

}
