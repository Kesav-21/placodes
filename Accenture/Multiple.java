import java.util.Scanner;

public class Multiple {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.print(i*a+" ");
            sum+=i*a;
        }
        System.out.println("\n"+sum);
    }
}
