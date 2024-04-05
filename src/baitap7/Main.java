package baitap7;

import java.util.Random;

public class Main extends Thread{
    Random random = new Random();

    public static void main(String[] args) {
        Main main1 = new Main();

        Thread thread = new Thread(main1);

        thread.start();


    }



    @Override public void run(){
        System.out.println(random.nextInt());


    }

}
