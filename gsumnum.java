import java.util.Scanner;

public class gsumnum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Number1");
        int n1=sc.nextInt();
        System.out.print("Number2");
        int n2=sc.nextInt();
        int sum=0;
        for(int i=n1;i<=n2;i++){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }    
}
