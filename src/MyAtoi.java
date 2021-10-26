public class MyAtoi {

    public int myAtoi(String s) {
           int len  = s.length();
           char[] charArray = s.toCharArray();
//           去除空格
        int index = 0;
        while (index<len && charArray[index] == ' '){
            index++;
        }

        if (index == len){
            return  0;
        }

        /*如果出现符号字符  并记录正负*/
        int sign = 1;
        char firstChar = charArray[index];
        if (firstChar == '+'){
            index++;
        }else if(firstChar == '-'){
            index++;
            sign = -1;
        }

        /*将后序出现的数字字符进行转换*/
        int res = 0;
        while (index<len){
            char currChar = charArray[index];
            /*先判断不合法的情况*/
            if (currChar>'9'||currChar<'0'){
                break;
            }
            // 题目中说：环境只能存储 32 位大小的有符号整数，因此，需要提前判：断乘以 10 以后是否越界
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            res = res*10+sign*(currChar-'0');
            index++;
        }
         return  res;
    }
}
