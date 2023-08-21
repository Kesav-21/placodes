import java.util.Scanner;

public class DistanceThreePoints {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        double first=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double second=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        double third=Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        System.out.println(first+second+third);
    }
}
