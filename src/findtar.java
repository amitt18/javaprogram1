import java.util.*;
public class findtar {
    public static int[] twosum(int[] nums,int tar){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            int diff = tar-nums[i];
            if(map.containsKey(diff)){
                int[] arr = new int[2];
                arr[0] = i;
                arr[i] = map.get(diff);
                return arr;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7,8};
        int tar= 9;
        twosum(nums,tar);
    }
}
