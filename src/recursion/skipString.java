package recursion;

public class skipString {
    static String SkipBoy(String up){
        if(up.isEmpty()){
          return " ";
        }

        if(up.startsWith("boy")){
           return SkipBoy(up.substring(3));
        }else{
          return up.charAt(0)+SkipBoy(up.substring(1));
        }
    }
    public static void main(String[]args){
        String str="areboylisten";
        String ans=SkipBoy(str);
        System.out.println(ans);

    }
}
