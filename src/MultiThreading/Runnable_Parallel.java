package MultiThreading;

//// Runnable Parallel MultiThreading

class cake1 implements Runnable{
    public void run() {
        System.out.println("Adding "+Thread.currentThread().getId());
        System.out.println("Mixing "+Thread.currentThread().getId());
        System.out.println("Baking "+Thread.currentThread().getId());
    }
}

public class Runnable_Parallel {
    public static void main(String[] args) {
        int cakecount = 5;
        for(int i=0;i<cakecount;i++){
            // Creates an object of cake1.
            cake1 c = new cake1();
            // Creates a Thread and gives the cake1 object to it.
            Thread t = new Thread(c);
            t.start();
        }
    }
}

// extends Thread
// → class itself becomes a Thread
//
// implements Runnable
// → class defines the task
// → Thread object runs that task