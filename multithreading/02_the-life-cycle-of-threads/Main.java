public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        // myThread.interrupt();
        // Thread.sleep(3000);
        myThread.setPriority(Thread.MAX_PRIORITY);
        Thread.yield();
        System.out.println(Thread.currentThread().getName());

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}