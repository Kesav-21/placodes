import java.util.*;
public class lyear {
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        int nyear=sc.nextInt();
        if(nyear%400==0){
            System.out.println("The entered year is Leap Year");}
        else if(nyear%4==0 && nyear%100!=0){
            System.out.println("The entered year is Leap Year");
        }
        else{
            System.out.println("The entered year is not a Leap Year");
        }
        sc.close();
        }
}

