import java.util.*;
public class Password {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int flag=1;
        int ch=0,n=0,sp=0;
        String a=sc.next();
        if(a.charAt(0)>='0' && a.charAt(0)<='9')
        flag=0;
        if(a.length()<4)
        flag=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='A' && a.charAt(i)<='Z')
            ch++;
            if(a.charAt(i)==' ' || a.charAt(i)=='/')
            flag=0;
            if(a.charAt(i)>='0'&& a.charAt(i)<='9')
            n++;
        }
        if(ch >0 && n>0){
            flag=1;
        }
        else
        flag=0;
        System.out.println(flag);
        sc.close();
    }
}
