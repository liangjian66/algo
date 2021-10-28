public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i  = a.length()-1 ; //a的 右边最后一位
        int j =  b.length()-1;  // b的右边最后一位
        int carry = 0; // 进位
        while (i>=0||j>=0||carry!=0){
            int digitA = i>=0?a.charAt(i)-'0':0; // a 的值
            int digitB = j>=0?b.charAt(j)-'0':0; // b的值
            int sum = digitA+digitB+carry;    // 加起来的值 包含进位
            carry = sum>=2?1:0;    // 是否有进位
            sum = sum>=2? sum-2:sum ;  // 最终填入结果的值
            res.append(sum); // 加入结果字符串
            i--;
            j--;
        }
           return  res.reverse().toString();
    }
}
