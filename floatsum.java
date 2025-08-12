import java.util.Scanner;

public class floatsum {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter two float values:");

        float p = ab.nextFloat();
        float q = ab.nextFloat();

        System.out.println("\nResult: " + p + " + " + q + " = " + (p + q));
    }
}
