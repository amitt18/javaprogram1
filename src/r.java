public class r {
    public static long countSubarrays(int[] nums, long k) {
        int count =  0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]<k) count++;
            int ans=0;
            int c2=2;
            for(int j=i+1;j<nums.length;j++){
                ans+=nums[j];
                if((nums[i]+ans)*c2<k){
                    count++;
                    c2++;
                }
                else{
                    c2++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {5,2,6,8,9,7};
        int k=50;
        long res = countSubarrays(nums,k);
        System.out.println(res);
    }
}
