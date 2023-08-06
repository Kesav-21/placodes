import java.util.Scanner;

public class greatestthree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number 1:");
        int n1=sc.nextInt();
        System.out.println("Enter the First Number 2:");
        int n2=sc.nextInt();
        System.out.println("Enter the First Number 3:");
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("n1 is greatest among all");
        }
        else if(n2>n1 && n2>n3){
            System.out.println("n2 is greatest among all");
        }
        else{
            System.out.println("n3 is greatest among all");
        }
        sc.close();
    }
}
