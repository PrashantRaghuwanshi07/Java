package Loops;

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Fruits = in.next();

//        switch(Fruits){
//            case "Mango":
//                System.out.println("King of Fruits");
//                break;
//            case "Apple":
//                System.out.println("Sweet red fruit");
//                break;
//            case "Banana":
//                System.out.println("Long yellow fruit");
//                break;
//            default:
//                System.out.println("Enter valid Fruit");
//                break;
//        }
        switch(Fruits){
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Banana" -> System.out.println("Long yellow fruit");
            default -> System.out.println("Enter valid fruit");
        }

    }
}
