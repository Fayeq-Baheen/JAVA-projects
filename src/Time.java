public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(){
        this(System.currentTimeMillis());
    }
    public Time(long elapsedTime) {
        timeSet(elapsedTime);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime){
        timeSet(elapseTime);
    }

    private void timeSet(long elapsedTime){
        elapsedTime /= 1000;
        this.second = (int)(elapsedTime % 60);
        elapsedTime /= 60;
        this.minute = (int)(elapsedTime % 60);
        elapsedTime /= 60;
        this.hour = (int)(elapsedTime % 24);
    }
}