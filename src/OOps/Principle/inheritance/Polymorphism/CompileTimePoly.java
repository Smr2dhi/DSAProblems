package OOps.Principle.inheritance.Polymorphism;

public class CompileTimePoly {
    static class Calculator{
        int add(int a,int b){
            return a+b;
        }
        int add(int a,int b,int c){
            return a+b+c;
        }
        double add(float a, float b){
            return a+b;
        }
    }

    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.add(3,5));
        System.out.println(cal.add(8.9f,2.4f));

    }
}
