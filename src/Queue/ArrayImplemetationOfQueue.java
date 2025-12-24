package Queue;


public class ArrayImplemetationOfQueue {
    private static class QueueA {
        private int f = -1;
        private int r = -1;
        private int size = 0;
        private int arr[] = new int[6];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) {
                f = r = 0;
            } else {
                r++;
            }
            arr[r] = val;
            size++;
        }

        public int remove() {
            if (f == -1) {
                System.out.println("Queue is empty");
                return -1;

            }
            int removed = arr[f];
            f++;
            size--;
            if (size == 0) {
                f = r = 0;
            }
            return removed;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;

            }
            return arr[f];
        }

        public void display(){
            if (size==0){
                System.out.println("queue is empty");
                return;
            }
            for(int i=f;i<=r;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
}
        public boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        QueueA q = new QueueA();

        q.add(10);
        q.add(20);
        q.add(30);

        q.display();        // 10 20 30
        System.out.println(q.remove()); // 10
        q.display();        // 20 30
        System.out.println(q.peek());   // 20

        System.out.println(q.isEmpty());


    }
}
