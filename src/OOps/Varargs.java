package OOps;

public class Varargs {
    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;

        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("The sum of 2 and 4 is"+sum(2,4));
        System.out.println("The sum of nothing is"+sum());
    }

}
