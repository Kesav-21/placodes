import java.util.Scanner;

public class Lucky {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag1=1;
        int flag2=1;
        int temp=n;
        if(temp%4==0 || temp%7==0)
            flag1=1;
        else
            flag1=0;
        int count=0;
        int no=0;
        while(n!=0){
            int rem=n%10;
            no++;
            if(rem==4 || rem==7){
                count++;
            }
            n/=10;
        }
        if(count==no){
            flag2=1;
        }
        else
        flag2=0;        
        if(flag1==1 || flag2==1){
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }
}
