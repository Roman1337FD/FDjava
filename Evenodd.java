import java.util.Scanner;
public class Evenodd{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number :-");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("EVEN");
        }
        else if(a!=0){
            System.out.println("ODD");
        }
        else{
            System.out.println("INVALID");
        }
    }
}
