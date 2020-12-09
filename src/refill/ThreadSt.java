package refill;

public class ThreadSt extends Thread {

    Time time;
    Gasst gasst;
    int car=0;


    public ThreadSt (Time t, Gasst s)  {
        this.time=t;
        this.gasst=s;
    }

    public void run () {

        while (time.GetFulltime()>0) {
            while (time.GetTime()>0) {
                car++;
                time.SetTime(time.GetTime()-6);
                if (time.GetTime()<0) {
                    //car--;
                    try {
                        this.sleep(gasst.GetRestTime());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
            time.SetTime(45);
            time.SetFulltime(time.GetFulltime()-time.GetTime()-gasst.GetRestTime());
        }

        gasst.SetCar(car);
    }
}
