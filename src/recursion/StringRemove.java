package recursion;

public class StringRemove {
    static String SkipStr(String p,String up){
        if(up.isEmpty()){
        System.out.println(p);
            return " " ;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            SkipStr(p,up.substring(1));
        }else{
            SkipStr(p+ch,up.substring(1));
        }
        return "";
    }

    public static void main(String[]args){
        String n="huaehxaagdea";
        String ans=SkipStr( " ",n);
    }
}
