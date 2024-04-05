package baitap8;

public class BaiTap8 {
    public static int count = 5;
    public static void main(String[] args) {

        DecreaseCount decreaseCount = new DecreaseCount();
        IncreaseCount increaseCount = new IncreaseCount();

        Thread thread = new Thread(decreaseCount);
        Thread thread1 = new Thread(increaseCount);

        thread1.start();
        thread.start();
    }
}
