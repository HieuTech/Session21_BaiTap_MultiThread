package baitap8;

import baitap8.BaiTap8;

import static baitap8.BaiTap8.count;

public class DecreaseCount implements Runnable{


    @Override
    public void run() {
       while (true){
           count --;
           System.out.println(count);
           try {
               Thread.sleep(150);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
