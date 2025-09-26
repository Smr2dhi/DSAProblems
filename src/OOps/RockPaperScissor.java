package OOps;
import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for Scissor,2 for Stone");
        int userInput=sc.nextInt();

        Random random=new Random();
        int compInput=random.nextInt(3);
         if (userInput==compInput){
             System.out.println("Draw");
         } else if (userInput==0 && compInput==2 || userInput==1 && compInput==0 || userInput==2 && compInput==1) {
             System.out.println("You win");

         }else{
             System.out.println("Computer win");
             System.out.println("Computer choice="+ compInput);
         }


    }
}
