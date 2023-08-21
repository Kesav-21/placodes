import java.util.Scanner;
public class NumberOfCarries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int carry=0;
        int sum=0;
        int c=0;
        while(n1!=0 && n2!=0){
            sum=n1%10+n2%10+carry;

            if(sum>9){
                carry=1;
                c++;
            }
            n1/=10;
            n2/=10;
        }
        while(n1!=0){
            sum=n1%10+carry;
            if(sum>9){
                carry=1;
                c++;
            }
            else{
                carry=0;
            }
            n1/=10;
        }
        while(n1!=0){
            sum=n1%10+carry;
            if(sum>9){
                carry=1;
                c++;
            }
            else{
                carry=0;
            }
            n1/=10;
        }
        while(n2!=0){
            sum=n2%10+carry;
            if(sum>9){
                carry=1;
                c++;
            }
            n2/=10;
        }
        System.out.println(c);
    }
}
