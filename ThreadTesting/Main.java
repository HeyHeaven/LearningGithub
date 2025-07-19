package ThreadTesting;

public class Main {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        TaskOne t1 = new TaskOne();
        TaskTwo t2 = new TaskTwo();
        Thread thread2 = new Thread(t2);
        t1.start();
        thread2.start();
        try{
            t1.join();          // Note : This alwas throws exception, thus us try-catch
            thread2.join();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print((System.currentTimeMillis())-startTime);

    }
}
