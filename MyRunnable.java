public class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
