import java.util.Scanner;

public class DecToBase{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int div=sc.nextInt();
        int num=sc.nextInt();
        String res="";
        while(num!=0){
            int rem=num%div;
            if(rem<=9){
                res=String.valueOf(rem)+res;
            }
            else
            res=(char)(rem-9+64)+res;
            num/=div;
        }
        System.out.println(res);
    }
}