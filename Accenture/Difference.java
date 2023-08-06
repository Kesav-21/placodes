import java.util.Scanner;

public class Difference {
    public static void diffSum(int m,int n){
        int dsum=0;
        int ndsum=0;
        for(int i=1;i<=n;i++){
            if(i%m==0)
            dsum+=i;
            else
            ndsum+=i;
        }
        System.out.println(ndsum-dsum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        diffSum(m, n);
    }
}
