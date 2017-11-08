package testMulti;

/**
 * Created by MRSMITH on 04.09.2017.
 */
public class Lab_Thread_Thread_Play_The_Accordion {
    public static void main(String[] args) throws InterruptedException {

        Thread threadCoordinator = new ThreadCoordinator();
        threadCoordinator.start();


    }
    public static class ThreadCoordinator  extends  Thread {




    }
}



