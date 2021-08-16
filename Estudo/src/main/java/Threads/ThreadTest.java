package Threads;

public class ThreadTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadRunnable('A'));
        Thread t2 = new Thread(new ThreadRunnable('B'));
        Thread t3 = new Thread(new ThreadRunnable('C'));
        Thread t4 = new Thread(new ThreadRunnable('D'));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


class ThreadRunnable implements Runnable{
    private char c;

    public ThreadRunnable(char c) {
        this.c = c;
    }

    @Override
        public void run() {
        for(int i = 0; i< 10; i++){
            System.out.println(c);
        }
    }

}
