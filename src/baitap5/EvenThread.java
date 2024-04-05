package baitap5;

public class EvenThread extends Thread{
    @Override

    public void run(){
        for (int i = 1; i <= 10 ; i++) {
            if(i %2 == 1){
                System.out.println("Even Number " + i);
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
