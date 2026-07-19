package String;

import java.util.ArrayList;

public class StringConcatenation {
    static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a'+3));

        //int will be converted to Integer that will call toString()
        System.out.println("a"+1);

        System.out.println("Prashant" + new ArrayList<>());

        System.out.println(new Integer(22) + " " + new ArrayList<>());
    }
}