import java.util.Scanner;
public class Add{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of A:-");
        int A=sc.nextInt();
         System.out.println("enter the value of B:-");
        int B=sc.nextInt();

        int Sum= A + B ;
        System.out.println(Sum);


    }
}