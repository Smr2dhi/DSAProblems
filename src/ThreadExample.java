class Mythread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Thread Interrupted");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.start();
        for(int i=0;i<=5;i++){
            System.out.println("Main"+" ");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("main thread interrupt");

            }
        }
    }
}
