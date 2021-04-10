public class Main {
    public static void main(String[] args) {

        AlarmClock firstAlarm = new AlarmClock(12, 12, 12);
        AlarmClock secondAlarm = new AlarmClock(12, 12, 12);

        firstAlarm.setTime(12, 12, 10);

        System.out.println(firstAlarm.alarmIsRinging());
        firstAlarm.tic();
        System.out.println(firstAlarm.alarmIsRinging());
        System.out.println(firstAlarm.alarmIsOn());
        System.out.println(firstAlarm.alarmIsOn());
        System.out.println(firstAlarm.equals(secondAlarm));
        System.out.println(firstAlarm);
    }
}
