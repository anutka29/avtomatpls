package refill;

public class Time {
    int fulltime;
    int time;


    public Time(int fulltime, int time) {
        this.fulltime=fulltime;
        this.time=time;

    }
    public int GetFulltime () {return fulltime;}

    public void SetFulltime(int fulltime) {this.fulltime=fulltime;}

    public int GetTime() {return time;}

    public void SetTime(int time) {this.time=time;}

}
