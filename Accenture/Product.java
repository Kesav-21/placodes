import java.util.Scanner;

public class Product {
    public static int productSmallestPair(int sum,int[] arr){
        if(arr.length<2)
        return -1;
        int temp,s;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        s=arr[0]+arr[1];
        if(s<=sum)
        return arr[0]*arr[1];
        else
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(productSmallestPair(sum,arr));
    }
}
