import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    static  void  reverselist(ArrayList<Integer> list){
int i=0;
int j=list.size()-1;
while(i<j){
    Integer temp = Integer.valueOf(list.get(i));
    list.set(i,list.get(j));
    list.set(j,temp);
    i++;
    j--;
}
    }

    public static void main(String[] args) {
//        Integer i= Integer.valueOf(4);
//        Float f = Float.valueOf(4.5f);
//        Double d = Double.valueOf(4.55);
//        System.out.println(i);
//        System.out.println(f);
//        System.out.println(d);
        ArrayList<Integer> list = new ArrayList<>();

        // add new element
        list.add(5);
        list.add(60);
        list.add(71);
        list.add(8);
        list.add(22);
        System.out.println(list+ " ");
       // reverselist(list);
//        Collections.reverse(list);
//        System.out.println(list+ " ");
        Collections.sort(list);
        System.out.println(list+ " ");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list+ " ");
      // l1.add(1,100);
       // l1.set(1,50);

        // get an element at index
      //  System.out.println(l1.get(2));

        // print the list
       // for(int i=0;i<l1.size();i++){
        //    System.out.print(l1.get(i)+ " ");
      //  }

        // removing element at index
       // l1.remove(1);
       // l1.remove(Integer.valueOf(5));

        // check whether a elememnt exist in list or not
       // boolean ans = l1.contains(Integer.valueOf(6));
     //   System.out.println(ans);

        // reverse the element of arraylist

        // print list directly
       // System.out.println(l1);
    }
}
