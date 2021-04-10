public class AlarmClock {

    private Clock time;
    private Clock alarm;

    public AlarmClock(int hour, int minute, int second) {
        setAlarm(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        time = new Clock(hour, minute, second);
    }

    public void setAlarm(int hour, int minute, int second) {
        alarm = new Clock(hour, minute, second);
    }

    public void tic() {
        time.tic();
        System.out.println(time);
    }

    public boolean alarmIsOn() {
        return alarm != null;
    }

    public boolean alarmIsRinging() {
        return alarmIsOn() && !time.isBefore(alarm);
    }

    public void turnOffAlarm() {
        alarm = null;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AlarmClock)) return false;
        AlarmClock other = (AlarmClock) obj;
        return alarmIsOn() && alarm.equals(other.alarm);
    }

    @Override
    public String toString() {
        return "alarm= " + (alarmIsOn() ? alarm : "no alarm");
    }
}
