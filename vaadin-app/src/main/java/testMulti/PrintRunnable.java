package testMulti;

/**
 * Created by MRSMITH on 04.09.2017.
 */
public class PrintRunnable implements Runnable {
    private String msg;
    private long sleepMillis;

    public PrintRunnable(String msg, long sleepMillis) {
        this.msg = msg;
        this.sleepMillis = sleepMillis;
    }

    @Override
    public void run() {
        for (int k=0;k<10;k++){
            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
            System.out.println(msg);
        }
    }
}
