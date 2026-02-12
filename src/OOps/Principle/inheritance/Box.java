package OOps.Principle.inheritance;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        super();
        this.h=-1;
        this.l=-1;
        this.w=-1;

    }
    Box(double side){
    this.w=side;
    this.l=side;
    this.h=side;
}
Box(double l,double h,double w){
    this.l=l;
    this.h=h;
    this.w=w;
}
Box(Box old){
    this.h=old.h;
    this.l=old.l;
    this.w=old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
    static void run(){
        System.out.println("Running in main Box ");
    }

}