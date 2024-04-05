package baitap.baitap4;

public class Main {
    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator1 = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread = new Thread(numberGenerator);

        thread.start();
        thread1.start();

    }
}
