package OOps.learning;

public class  staticClass {
    static int a=9;
    static int b;
    static {
        System.out.println("I am in static block");
        b=a*4;

    }

    public static void main(String[] args) {
        staticClass obj= new staticClass();
        System.out.println(staticClass.a +" "+ staticClass.b);

        staticClass.b+=3;
        System.out.println(staticClass.a + " " + staticClass.b);

        staticClass obj2 =new staticClass();
        System.out.println(staticClass.a + " " + staticClass.b);

    }

}
