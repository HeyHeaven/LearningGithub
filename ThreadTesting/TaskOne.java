package ThreadTesting;

public class TaskOne extends Thread {
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            if(i%5==0) count++;
            else continue;
        }
        System.out.println(count);
    }
}
