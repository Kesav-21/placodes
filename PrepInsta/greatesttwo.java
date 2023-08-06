import java.util.Scanner;

public class greatesttwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Number 1: ");
        int n1=sc.nextInt();
        System.out.print("Number 2: ");
        int n2=sc.nextInt();
        if(n1<n2)
        System.out.println("Number 2 is greater than Number 1");
        else
        System.out.println("Number 1 is greater than Number 2"); 
        sc.close();      
    }    
}
