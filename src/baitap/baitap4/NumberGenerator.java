package baitap.baitap4;

import java.util.Random;

public class NumberGenerator implements Runnable{

    Random random = new Random(10);

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + random.nextInt());
            System.out.println("Thread " +
                    Thread.currentThread().getName()
            + " Hashcode " + hashCode()
                    );
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
