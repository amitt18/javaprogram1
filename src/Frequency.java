import java.util.Scanner;
public class Frequency {
    static int[] makeFrequencyArray(int[] a){
        int n=a.length;
        int[] freq = new int[100005];
        for(int i=0;i<n;i++){
               freq[a[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enterr size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] freq = makeFrequencyArray(a);
        System.out.println("enter no. of query");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("enter no. to be searched");
           int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
    }
}
