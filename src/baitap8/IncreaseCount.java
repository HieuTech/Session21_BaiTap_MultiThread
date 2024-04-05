package baitap8;

public class IncreaseCount implements Runnable{
    @Override
    public void run() {
     while (true){
         BaiTap8.count ++;
         System.out.println(BaiTap8.count);

         try {
             Thread.sleep(150);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }
    }
}
