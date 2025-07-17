import java.util.*;
public class flash {
        public static int[] diff(int[] dec,int[] flash){
            int res[] = new int[4];
            int i=0;
            int j=0;
            int k=0;
            while(i<dec.length && j<flash.length){
                res[k++] = dec[i]*flash[j];
                i++;
                j++;
            }
            return res;
        }

        public static int[] first(int[] arr,int[] res){
            int res2[] = new int[4];
            int i=0;
            int j=0;
            int k=0;
            while(i<arr.length && j<res.length){
                res2[k++] = arr[i]-res[j];
                i++;
                j++;
            }
            return res2;
        }
        public static int[] sec(int[] arr,int[] res1){
            int res3[] = new int[4];
            int i=0;
            int j=0;
            int k=0;
            while(i<arr.length && j<res1.length){
                res3[k++] = arr[i]-res1[j];
                i++;
                j++;
            }
            return res3;
        }
        public static void main(String args[] ) throws Exception {


            // Write your code here
            Scanner sc = new Scanner(System.in);
            System.out.println("testcases");
            int t = sc.nextInt();

            for(int m=0;m<t;m++){
                int[] arr = new int[4];
                System.out.println("enter arr");
                for(int i=0;i<4;i++){
                    arr[i] = sc.nextInt();
                }
                int[] dec = new int[4];
                System.out.println("enter dec");
                for(int j=0;j<4;j++){
                    dec[j] = sc.nextInt();
                }
                int[] flash = new int[4];
                System.out.println("enter flash");
                for(int k=0;k<4;k++){
                    flash[k] = sc.nextInt();
                }
                int[] cisco = new int[4];
                System.out.println("enter cisco");
                for(int l=0;l<4;l++){
                    cisco[l] = sc.nextInt();
                }
                int  res[] = diff(dec,flash);
                int res1[] = diff(dec,cisco);
                int res2[] = first(arr,res);
                int res3[] = sec(arr,res1);
                int c1=0;
                int c2=0;
                for(int a=0;a<res2.length;a++){
                    c1+=res2[a];
                }
                for(int b=0;b<res3.length;b++){
                    c2+=res3[b];
                }
                if(c1>c2){
                    System.out.print("Flash");
                }
                else if(c1<c2){
                    System.out.print("Cisco");
                }
                else{
                    System.out.print("Tie");
                }
            }

        }
    }



