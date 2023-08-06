import java.util.*;
public class prime{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        if(n<2){
            flag=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
        }
        String result = flag ? "Prime" : "not Prime";
        sc.close();
     System.out.println ("The number " + n + " is : " + result);
    }
}