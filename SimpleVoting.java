import java.util.Scanner;

public class SimpleVoting {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = a.nextInt();

        if (age <18) {
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("eligible to candidate:");
           
        }

        a.close();
    }
}
