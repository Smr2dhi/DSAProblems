package OOps.Principle.inheritance.Polymorphism;

public class RuntimePoly {
    static class Animal{
        void sound(){
            System.out.println("animals make sound");
        }

    }static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Dog makes sound");
        }
        void height(){
            System.out.println("Height");
        }
    }

    public static void main(String[] args) {
        Animal a= new Dog();
        a.sound();
//        a.height(); give error.
    }
}
