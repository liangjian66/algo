public class RotateString {

    public  boolean rotateString(String a , String b){
        if (a.length()!=b.length()){
            return  false;
        }
        String newB = b+b;
        if (newB.contains(a)){
            return true;
        }
        return  false;
    }
}
