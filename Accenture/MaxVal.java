import java.util.Scanner;

public class MaxVal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        int ind=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
                ind=i;
            }
        }
        System.out.println(max+" "+ind);
        
    }
}
