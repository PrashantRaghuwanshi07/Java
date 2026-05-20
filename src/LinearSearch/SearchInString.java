package LinearSearch;

public class SearchInString {
    static void main(String[] args) {
        String name = "prashant";
        char target = 'a';
        System.out.println(search(name, target));
    }
    static boolean search(String name, char target) {
        if(name.length() == 0) {
            return false;
        }
        for(int i=0; i<name.length(); i++) {
            if(target == name.charAt(i)) {
                return true;
            }
        }
//        convert string into array of char
//        for(char ch : name.toCharArray()) {
//            if(ch == target) {
//                return true;
//            }
//        }
        return false;
    }
}
