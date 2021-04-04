public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        set(hour, minute, second);
    }

    public void set(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public int getTimeInSeconds() {
        return this.hour * 3600 + this.minute * 60 + this.second;
    }

    public String getSimpleTime() {
        return this.hour + ":" + this.minute;
    }

    @Override
    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }
}
