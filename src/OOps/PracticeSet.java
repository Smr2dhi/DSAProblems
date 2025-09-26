package OOps;

public class PracticeSet {
    class cylinder {
        private int height;
        private int radius;

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    public static void main(String[] args) {
        // First, create an instance of PracticeSet
        PracticeSet practiceSet = new PracticeSet();

        // Then, use that instance to create an instance of cylinder
        cylinder mycylinder = practiceSet.new cylinder();

        mycylinder.setHeight(89);
        int h = mycylinder.getHeight();
        System.out.println(h);
    }
}
