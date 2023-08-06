import java.util.*;

class Rat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int f = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            count++;
            sum += arr[i];
            if (sum >= r * f)
                break;
        }
        sc.close();
        System.out.println(count);
    }
}