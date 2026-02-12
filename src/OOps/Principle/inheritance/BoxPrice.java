package OOps.Principle.inheritance;

public class BoxPrice extends BoxWeight{
    float price;

    public BoxPrice(double l,double h,double w,double weight,float price) {
        super(l, h, w, weight);
        this.price = price;
    }
    public BoxPrice() {
        super(1,4,6,7);
        this.price=23;
    }

    static void run(){
        System.out.println("Running in main BoxPrice ");
    }
}
