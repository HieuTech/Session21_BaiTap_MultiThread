package baitap5;

public class Main {
    public static void main(String[] args)  {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();

        try {
            evenThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        oddThread.start();

    }
}
