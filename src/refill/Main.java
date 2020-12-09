package refill;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Time time = new Time (240, 45);
        Gasst gasst1 = new Gasst(1,15,0);
        Gasst gasst2 = new Gasst(2,10,0);
        Gasst gasst3 = new Gasst(3,5,0);
        Gasst gasst4 = new Gasst(4,13,0);

        ThreadSt t1 = new ThreadSt (time, gasst1);
        ThreadSt t2 = new ThreadSt (time, gasst2);
        ThreadSt t3 = new ThreadSt (time, gasst3);
        ThreadSt t4 = new ThreadSt (time, gasst4);


        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Колонка 1: Обслужено машин: " + t1.gasst.GetCar());
        System.out.println("Колонка 2: Обслужено машин: " + t2.gasst.GetCar());
        System.out.println("Колонка 3: Обслужено машин: " + t3.gasst.GetCar());
        System.out.println("Колонка 4: Обслужено машин: " + t4.gasst.GetCar());

        System.out.println("Общее количество машин: " + (t1.gasst.GetCar() + t2.gasst.GetCar() + t3.gasst.GetCar() + t4.gasst.GetCar()));

    }
}
