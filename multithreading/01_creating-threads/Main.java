public class Main {
    public static void main(String[] args) throws Exception {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 400; i++) {
            System.out.println("Thread name is - " + Thread.currentThread().getName() +
                    ", i = " + i);
        }
    }
}