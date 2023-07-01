import java.util.*;
public class Process implements Runnable{
    public static List<Integer> evens = new ArrayList<>();
    public static List<Integer> odds = new ArrayList<>();

    public static List<Integer> thread1 = new ArrayList<>();
    public static List<Integer> thread2 = new ArrayList<>();
    public static List<Integer> thread3 = new ArrayList<>();
    public static List<Integer> thread4 = new ArrayList<>();

    List<Integer> numbers = new ArrayList<>();
    {
        for(int i=0; i<10000; i++){
            numbers.add(i);
        }
        for(int i=0; i<numbers.size(); i++){
            if(i<numbers.size()/4){ //2500
                thread1.add(i);
            }
            else if(i<numbers.size()/2){ //5000
                thread2.add(i);
            }
            else if(i<numbers.size()*3/4){ //7500
                thread3.add(i);
            }
            else{ //10000
                thread4.add(i);
            }
        }
    }

    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("Thread-0")){
            for(Integer number : thread1){
                add(number);
            }
        }
        if(Thread.currentThread().getName().equals("Thread-1")){
            for(Integer number : thread2){
                add(number);
            }
        }
        if(Thread.currentThread().getName().equals("Thread-2")){
            for(Integer number : thread3){
                add(number);
            }
        }
        if(Thread.currentThread().getName().equals("Thread-3")){
            for(Integer number : thread4){
                add(number);
            }
        }
    }

    synchronized void add(int number){
        if(number%2==0){
            System.out.println(Thread.currentThread().getName() + " -> " + number);
            evens.add(number);
        }
        else {
            System.out.println(Thread.currentThread().getName() + " -> " + number);
            odds.add(number);
        }
    }
}
