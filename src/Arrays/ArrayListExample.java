package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//
//        System.out.println(list);
//
//        //check
//        System.out.println(list.contains(7));
//        // update
//        list.set(0,99);
//        System.out.println(list);
//        //remove
//        list.remove(0);
//        System.out.println(list);

        // input
        for (int i=0; i<5; i++) {
            list.add(in.nextInt());
        }

        // get item
        for(int i=0; i<5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
