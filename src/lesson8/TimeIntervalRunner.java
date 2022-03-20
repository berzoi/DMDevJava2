package lesson8;

public class TimeIntervalRunner {

    public static void main(String[] args) {
        TimeInterval timeInterval = getTimeInterval();

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());
        timeInterval1.print();

        TimeInterval interval = timeInterval.sum(timeInterval1);
        interval.print();

    }

    private static TimeInterval getTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }
}
