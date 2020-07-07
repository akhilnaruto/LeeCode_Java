package QueueAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream_346 {
    public static void main(String[] args) {
        MovingAverage m = new MovingAverage(3);
            double ans = m.next(1);
            ans = m.next(10);
            ans = m.next(3) ;
            ans  = m.next(5) ;
             ans  = m.next(5) ;
    }
    

    
}


    /*
MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3

    */

class MovingAverage {

    private int size = 0;
    private int sum = 0;
    private int runningSize = 0;
    Queue<Integer> queue = new LinkedList<>();

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
          this.size = size;
    }
    
    public double next(int val) {
        if(queue.size() >= size){
            sum = sum - queue.poll();
        }
        queue.add(val);
        sum += val;
        return (sum * 1.0)/queue.size();
    }
}
