import java.util.*;

public class numbertypes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked whether postive or negative");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("The Entered Number is Negative");
        }
        else if(n>0){
            System.out.println("The Entered Number is Postive");
        }
        else{
            System.out.println("The Entered Number is Zero");
        }
        sc.close();
    }
}