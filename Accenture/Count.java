import java.util.Scanner;

public class Count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int diff=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(Math.abs(num-a[i])<=diff)
            count++;
        }
        System.out.println(count);
    }
}
