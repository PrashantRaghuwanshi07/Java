package String;

public class PrettyPrinting {
    static void main(String[] args) {
        float a = 546.64678f;
        //%.3f round of to 3 decimal places
        System.out.printf("Formatted numder is %.2f", a);

        System.out.println();
        System.out.printf("Pie : %.3f", Math.PI);

        System.out.println();
        // Placeholders
        System.out.printf("Hello my name is %s and I am %s", "Prashant", "Cool");
    }
}
