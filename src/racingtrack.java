public class racingtrack {
    static boolean ispossible(int[] a,int k,int dis){
        int kp = 1;
        int lk = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-lk>=dis){
                kp++;
                lk = a[i];
            }
        }
        return kp>=k;
    }
    static int race(int[] a,int k){
        if(k>a.length) return -1;
        int s=0;
        int e = (int)1e9;
        int ans=-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(ispossible(a,k,mid)){
                ans = mid;
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,8,9};
        int k=3;
        System.out.println(race(a,k));
    }
}
