import java.util.Scanner;

public class pre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " mi it mit";
        String[] arr = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                if(str.charAt(i)==str.charAt(j)){
                    ans.append(str.charAt(i));
                }
            }
        }
        System.out.println(ans);
    }
}
