import java.util.Scanner;

public class pallind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0;
        int j = str.length()-1;
        boolean ispalin = true;
        while (i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                ispalin = false;
                break;
            }
        }
        if(!ispalin){
            System.out.println(" not pallindrome");
        }
        else{
            System.out.println(" pallindrome");
        }
    }
}
