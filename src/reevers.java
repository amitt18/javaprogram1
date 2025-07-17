import java.util.Scanner;

public class reevers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "amit is a good boy";
        StringBuilder ans = new StringBuilder();
        String[] arr = str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            ans.append(arr[i]);
            if(i!=0){
                ans.append(" ");
            }
        }
        System.out.println(ans);
    }
}
