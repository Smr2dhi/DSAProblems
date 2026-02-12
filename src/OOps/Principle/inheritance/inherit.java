package OOps.Principle.inheritance;

public class inherit {
    public static void main(String[] args) {
        Box box=new Box(4,8,9);

        Box box3 =new Box();
        Box box2=new Box(box3);
     BoxWeight  box5 =new BoxWeight(8,9,2,3);
     BoxPrice boxA=new BoxPrice(2,3,4,5,9);
        BoxPrice boxB=new BoxPrice();


//        System.out.println(box.l +" "+box.w+ " "+box.h);
//        System.out.println(box2.l+" "+box2.h+" "+box2.w);
//        System.out.println(box5.l +" "+box5.w+ " "+box5.h+ " "+box5.weight);
//        System.out.println(boxA.l +" "+boxA.w+ " "+boxA.h+ " "+boxA.weight+ " " +boxA.price);

//        System.out.println(boxB.l +" "+ boxB.h +" "+ boxB.w+" "+ boxB.weight+" "+ boxB.price);

        Box b1= new BoxPrice();
        Box.run();


    }
}
