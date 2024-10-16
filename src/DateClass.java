import java.util.Date;
public class DateClass {
    public static void main(String[] args) {
        Date d = new Date();
        Date d1 = new Date();
        System.out.println("Current Day, Date and Time: "+d);
        System.out.println("Time: "+d.getTime()+" millisecond");  // getTime() method provides times in millisecond
        System.out.println("Date: "+d.getDate());  // getDate() method provides current date
        System.out.println("Day: "+d.getDay());
        System.out.println("Month: "+d.getMonth());
        int Year = (1900 + d.getYear());
        System.out.println("Year: "+Year);
        System.out.println("Hours: "+d.getHours());
        System.out.println("Minutes: "+d.getMinutes());

    }
}
