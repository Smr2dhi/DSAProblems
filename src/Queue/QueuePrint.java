package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueuePrint {
    public static void main(String[] args) {
        Queue<Integer> q =new ArrayDeque<>();
        System.out.println(q.isEmpty());
        q.add(6);
        q.add(5);
        q.add(8);
        q.add(1);
        q.add(12);
        System.out.println(q.isEmpty());
        System.out.println(q);
        Queue<Integer> qt =new ArrayDeque<>();
        while(q.size()>0){
            System.out.println(q.peek()+" ");
            qt.add(q.remove());

        }

        while(qt.size()>0){
            q.add(qt.remove());
        }
    }
}

