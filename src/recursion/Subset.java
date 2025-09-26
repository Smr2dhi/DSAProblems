package recursion;

public class Subset {
    static String PrintSubSet(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return "";
        }char ch=up.charAt(0);
        PrintSubSet(p+ch,up.substring(1));
        PrintSubSet(p,up.substring(1));
        return "";
    }
    public static void main(String[] args) {
      String str="abd";
      String ans=PrintSubSet(" ",str);

    }
}
