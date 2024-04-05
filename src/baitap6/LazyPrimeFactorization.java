package baitap6;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            if(isPrime(i)){
                System.out.println("Prime " + i);
            }
        }
    }

    public boolean isPrime(long num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < num /2; i++) {
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
}
