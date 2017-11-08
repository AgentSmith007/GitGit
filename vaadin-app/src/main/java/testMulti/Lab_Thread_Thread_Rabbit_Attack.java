package testMulti;

/**
 * Created by MRSMITH on 04.09.2017.
 */
public class Lab_Thread_Thread_Rabbit_Attack {
    public static void main(String[] args) throws InterruptedException {
        for (int k = 1; k < 100; k++) {
            String spaces = spaces(k);
            Runnable printer = new PrintRunnable(spaces + k, 100);
            Thread thread = new Thread(printer);
            thread.start();
            Thread.sleep(100);
        }
    }

    private static String spaces(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += " ";
        }
        return result;
    }

}
