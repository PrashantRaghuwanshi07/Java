package String;

import java.util.Arrays;

public class Methods {
    static void main(String[] args) {
        String name = "Prashant Raghuwanshi";

        // convert into arr of char
        System.out.println(Arrays.toString(name.toCharArray()));

        // give index of particular char
        System.out.println(name.indexOf('a'));

        // extra whitespaces removed
        System.out.println("   Prashant   ".strip());

        //for converting string into arr by splitting at particular index
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
