package OOps;

 class Employee{
    int salary;
    String name;
   public int getSalary(){
      return salary;

    }
    public String getName(){
       return "Samriddhi";
    }
    public void SetName(String n){
      name=n;
    }
}
class cellphone{
     public void ringing(){
         System.out.println("Ringing");

     }
     public void vibrating(){
         System.out.println("the phone is ringing");
     }
}
class Square{
     int side;
     public int area(){
         return side*side;
     }
     public int perimeter(){
         return 4*side;
     }

}
public class Practice1 {
    public static void main(String[] args) {
//        Employee Sam=new Employee();
//        System.out.println(Sam.getSalary());
//        cellphone asus =new cellphone();
//        asus.ringing();
//        asus.vibrating();
        Square sq =new Square();
        sq.side=6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
