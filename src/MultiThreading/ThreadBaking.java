package MultiThreading;

//// Parallel processing

class Cake  extends Thread {
    public void run() {
        System.out.println("Mixing ingredients for cake "+ Thread.currentThread().getId());
        System.out.println("Baking cake "+ Thread.currentThread().getId());
        System.out.println("Decorating cake "+ Thread.currentThread().getId());
    }
}

public class ThreadBaking {
    static void main(String[] args) {
        int cakecount = 4; // We want to make 4 cakes.

        for (int i = 1; i <= cakecount; i++) { // Loop runs 4 times.
            Cake cake = new Cake();
            cake.start(); // Parallel execution, output will be mixed
            //cake.run(); // Line by line execution, same as sout
        }
    }
}
