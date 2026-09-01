package MultiThreading;

class CakeCounter{
    int count=0;

    //// synchronized na, ore time-la oru thread mattum indha method-a access panna mudiyum.
    public synchronized void increment(){
        count++;
    }
}

class Team implements Runnable{

    // CakeCounter object-a point panna oru reference variable mattum.
    CakeCounter counter;

    Team(CakeCounter counter) {
        this.counter = counter;
    }

    public void run(){
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }
}

public class Sync_Keyword {
    public static void main(String[] args) {
        CakeCounter counter=new CakeCounter();

        Thread t1 = new Thread(new Team(counter));
        Thread t2 = new Thread(new Team(counter));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){

        }

        System.out.println(counter.count);
    }
}

//              CakeCounter
//             count = 0
//              /       \
//             /         \
//         Team 1       Team 2
//           ↓             ↓
//        Thread 1      Thread 2