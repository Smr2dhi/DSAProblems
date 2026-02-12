package OOps.learning;

public class SIngletonClass {

    private static SIngletonClass instance;

    private SIngletonClass() {
        System.out.println("hello i am in singleton class constructor");

    }

    public static SIngletonClass getInstance() {
        if (instance == null) {
            instance = new SIngletonClass();

        }
        return instance;
    }
}

