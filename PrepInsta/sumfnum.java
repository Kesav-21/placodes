import java.util.Scanner;
public class sumfnum {
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to be find sum:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of the first n natural numbers:"+sum); 
        sc.close();      
    }
}

