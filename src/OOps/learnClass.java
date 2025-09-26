package OOps;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;

class phone{
    int price;
    String Name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public void printDetails() {
        System.out.println("price of mobile 1" + price);
        System.out.println(" the nam eof mobile is"+ Name);
    }
}

public class learnClass {
    public static void main(String[]args){
        System.out.println(" hello I am in main function");
        phone Sam =new phone();
            Sam.price=23894;
            Sam.Name="Samriddhi Yadav";
            Sam.salary=6098779;
phone Khushi=new phone();
Khushi.price=988765;
Khushi.Name="Samsung";
            Sam.printDetails();
            Khushi.printDetails();
//        System.out.println(Sam.price);
//        System.out.println(Sam.Name);

int salary=Sam.getSalary();
    }
}
