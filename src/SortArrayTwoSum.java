/**/

public class SortArrayTwoSum {

    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null){
            return  new int[0];
        }
        int i = 0;
        int j = numbers.length -1;
        int[] size =  new int[2];
        while (i<j){
            if (numbers[i]+ numbers[j] == target){
                size[0] = i+1;
                size[1] = j+1;
                return  size;
            }else if (numbers[i]+ numbers[j] > target){
                j--;
            }else {
                i++;
            }
        }
        return  size;

    }
}
