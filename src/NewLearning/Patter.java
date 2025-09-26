package NewLearning;

public class Patter {
    static void pattern9(int num){
        for(int i=0;i<2*num-1;i++){
            for(int j=0;j<2*num-1;j++){
                int indexValue = Math.min(Math.min(i, j), Math.min(2 * num - 2 - i, 2 * num - 2 - j));
                System.out.print(num - indexValue);
            }
            System.out.println();
        }
    }
    static void pattern8(int num){
        for(int i=1;i<num;i++){
            for(int s=0;s<num-i;s++){
                System.out.print(" ");
            }
for(int j=i;j>=1;j--){
    System.out.print(j);
}for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patter7(int num){
        for(int i=1;i<2*num;i++){
            int col=i<num ? i :2*num-i;
            int spaces=num-col;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<col;j++){
                System.out.print("& ");
            }
            System.out.println();
        }

    }
    static void patter6(int num){
        for(int i = 1; i<2* 5; i++){
        int col=i< 5 ? i :2* 5 -i;
        for(int j=1;j<col;j++){
            System.out.print("& ");
        }
            System.out.println();
        }

    }
    static void patter4(int num){
        for(int i=1;i<num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void patter3(int num){
        for(int i=0;i<num;i++){
            for(int j=num-1;j>i;j--){
                System.out.print("7");
            }
            System.out.println();
        }
    }
    static void patter2(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    static void pattern1(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        pattern1(4);
        patter2(6);
        patter3(3);
        patter4(5);
        patter6(5);
        patter7(6);
        pattern8(5);
        pattern9(5);
    }
}
