import java.util.*;
public class ReplaceChar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c1)
            res+=c2;
            else
            res+=str.charAt(i);
        }
        System.out.println(res);
    }
}
