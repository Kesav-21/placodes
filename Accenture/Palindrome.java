import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int temp=i;
            int res=0;
            while(temp!=0){
                int rem=temp%10;
                res=res*10+rem;
                temp/=10;
            }
            if(res==i){
                System.out.print(i+" ");
            }
        }
    }
}
