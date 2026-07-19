package String;
public class Intro {
    static void main(String[] args) {
//        String a = "Prashant";
//        String b = "Prashant";
//        // == give true as both ref var points to same object in pool inside heap
//        System.out.println(a == b);
//
//        String c = new String("Prashant");
//        String d = new String("Prashant");
//        // create diff obj of same value outside pool but inside heAP
//        System.out.println(c == d);
//
//        //.equals only checks value
//        System.out.println(c.equals(d));
        String p =  "prashant";
        char[] arr  = p.toCharArray();
        System.out.println(arr);
        int ans = 0;
        for(int i=0; i< arr.length; i++) {
            ans =  ans + arr[i];
        }
        System.out.println(ans);

    }
}
