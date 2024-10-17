import java.time.LocalDate;
import java.time.LocalTime;

public class JavaTimeAPI {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Current Date: "+ld);

        LocalTime lt = LocalTime.now();
        System.out.println("Current time: "+lt);
    }
}
