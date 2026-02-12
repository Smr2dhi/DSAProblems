package OOps.learning;

public class practiceSingleton {
    public static void main(String[] args) {
        SIngletonClass obj1= SIngletonClass.getInstance();

        SIngletonClass obj2 = SIngletonClass.getInstance();

        if(obj1==obj2){
            System.out.println("only one object created");
        }
        else System.out.println("mltiple onj created");
    }
}
