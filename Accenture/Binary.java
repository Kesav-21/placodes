public class Binary {
    public static void main(String args[]){
        String str="1C0C1C1A0B1";
        int result=str.charAt(0)-'0';
        System.out.println(result);
        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)=='C'){
                result=result^((str.charAt(i+1)-'0'));
            }
            else if(str.charAt(i)=='A'){
                result=result&((str.charAt(i+1)-'0'));
            }
            else if(str.charAt(i)=='B'){
                result=result|((str.charAt(i+1)-'0'));
            }
        }
        System.out.println(result);
    }
}
