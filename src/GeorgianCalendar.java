import java.util.Calendar;
import java.util.GregorianCalendar;

public class GeorgianCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println("Date: "+cal.get(Calendar.DATE));
        System.out.println("Month: "+cal.get(Calendar.MONTH));
        System.out.println("Year: "+cal.get(Calendar.YEAR));
        System.out.println("Seconds: "+cal.get(Calendar.SECOND));
        System.out.println("Hours: "+cal.get(Calendar.HOUR));       // 12 hours timing
        System.out.println("Hours of day: "+cal.get(Calendar.HOUR_OF_DAY));       // 24 hours timing
        System.out.println("Current time: "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));

        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Is leap year: "+calendar.isLeapYear(2020));
    }
}
