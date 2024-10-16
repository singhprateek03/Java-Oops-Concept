import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass {
    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        System.out.println("Calendar type: "+cal.getCalendarType());
//        System.out.println("Time Zone: "+cal.getTimeZone());

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));    // Customize Time Zone
        System.out.println("Calendar type: "+cal.getCalendarType());
        System.out.println("Time Zone: "+cal.getTimeZone().getID());
    }
}
