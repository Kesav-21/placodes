import java.util.Scanner;

public class LargeSmallSum {
    public static int largeSmallSum(int[] arr){
        if(arr.length<=3){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(arr.length%2==0){
            System.out.print(arr[arr.length-4]+arr[3]);
        }
        else
        System.out.print(arr[arr.length-3]+arr[3]);
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        largeSmallSum(arr);
    }
}
