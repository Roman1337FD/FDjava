import java.util.Scanner;
public class sub{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number A:-");
        int A = sc.nextInt();
        System.out.println("Enter a number B:-");
        int B = sc.nextInt();

        int sub= A - B;
         System.out.println(sub);
    }
}