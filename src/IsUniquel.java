public class IsUniquel {

    public  boolean isUniquel(char[] chas){
        if (chas == null){
            return  true;
        }
        /*字符对应 ASCII码表*/
        boolean[] arr = new boolean[256];
        for (int i = 0; i < chas.length; i++) {
            if (arr[chas[i]]){
                return false;
            }
             arr[chas[i]] = true;
        }
        return  true;
    }
}
