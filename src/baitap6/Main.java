package baitap6;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

    Thread thread = new Thread(lazyPrimeFactorization);
    Thread thread1 = new Thread(optimizedPrimeFactorization);

    thread1.start();
    thread.start();

    }
}
