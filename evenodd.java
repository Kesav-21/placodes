import java.util.*;

public class evenodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that is odd or even");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The entered Number is Even");
        }
        else
            System.out.println("The entered Number is Odd");
        sc.close();
    }
}
