package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // System.out.println(list);

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        // initialize
        for(int i=0;i<3;i++){
            list2.add(new ArrayList<Integer>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list2.get(i).add(in.nextInt());

            }
        }

        System.out.println(list2);
        in.close();
    }
    

    
}
