package ThreadTesting;

public class TaskTwo implements Runnable{

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            if(i%5==0) count++;
        }
        System.out.println(count);
    }
}
