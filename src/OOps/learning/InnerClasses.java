package OOps.learning;


public  class InnerClasses {
   static class Test{
          String name;
        public Test(String name){
            this.name=name;
        }
    }



    public static void main(String[] args) {

        InnerClasses.Test a =new Test("Kunika");
       InnerClasses.Test b = new Test("Ruchika");

        System.out.println(a.name);
        System.out.println(b.name);
    }

    }

