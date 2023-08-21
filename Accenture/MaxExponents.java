import java.util.Scanner;

public class MaxExponents {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=0;
        int val=0;
        for(int i=a;i<=b;i++){
            int count=0;
            int n=i;
            while(n!=0 && n%2==0){
                count++;  
                n/=2;
            }
            if(max<count){
                max=count;
                val=i;
            }
        }
        System.out.println(val);
    }
}
