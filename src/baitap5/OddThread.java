package baitap5;

public class OddThread extends Thread{

    @Override
    public void run (){
        for (int i = 1; i <= 10 ; i++) {
            if(i %2 == 0){
                System.out.println("Odd Number " + i);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
