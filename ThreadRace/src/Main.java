public class Main {
    public static void main(String[] args) throws InterruptedException {
        Process proc = new Process();

        Thread t1 = new Thread(proc);//t1 processini oluşturuyoruz
        Thread t2 = new Thread(proc);//t2 processini oluşturuyoruz
        Thread t3 = new Thread(proc);//t3 processini oluşturuyoruz
        Thread t4 = new Thread(proc);//t4 processini oluşturuyoruz

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();

        System.out.println("TEKLER: " + Process.odds.size());//Tek olan sayıların kaç tane olduğu yazılıyor
        System.out.println("ÇİFTLER: " + Process.evens.size());//Çift olan sayıların kaç tane olduğu yazılıyor

    }
}