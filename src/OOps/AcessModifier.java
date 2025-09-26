package OOps;
class myEmployee{
   private int id;
 private String name;
 public String getName(){
     return name;
 }
 public void setName(String n){
     name=n;
 }
 public void setId(int i){
     id=i;
 }
 public int getId(){
     return id;
 }
}
public class AcessModifier {
    public static void main(String[] args) {
        myEmployee Sam=new myEmployee();
//        Sam.id=78;
//        Sam.name="Samriddhi Yadav";
       Sam.setName("Samriddhi");
        System.out.println(Sam.getName());
        Sam.setId(98);

        System.out.println(Sam.getId());
    }
}
