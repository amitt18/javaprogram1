public class distributedchochlate {
  static   boolean isDivision(int[] a,int m,int mx){
        int nos=1;
        int choc =0;
        for(int i=0;i<a.length;i++){
            if(a[i]>mx) return false;
            if(choc+a[i]<=mx){
                choc+=a[i];
            }
            else{
                nos++;
                choc = a[i];
            }
        }
        if(nos>m) return false;
        return true;
    }

    static int dc(int[] a,int m){
        if(a.length<m) return -1;
        int ans=0,st=1,end = (int)1e9;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(isDivision(a,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {12,34,67,90};
        int m =2;
        System.out.println(dc(a,m));
    }
}
