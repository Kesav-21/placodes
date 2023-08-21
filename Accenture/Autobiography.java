import java.util.Scanner;

public class Autobiography {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int ans=0;
        if(str=="")
        System.out.println("null");
        else{
            int sum=0;
            for(int i=0;i<str.length();i++){
                sum+=Integer.parseInt(str.charAt(i)+"");
            }
            if(sum==str.length()){
                 for(int i=0;i<str.length();i++){
                    int count=0;
                for(int j=0;j<str.length();j++){
                    if(i==Integer.parseInt(str.charAt(j)+""))
                        count++;
                }
                if(count>0)
                ans++;
            }
            }
        }
        System.out.println(ans);
    }
}
