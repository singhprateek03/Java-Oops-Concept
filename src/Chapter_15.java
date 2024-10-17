import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Chapter_15 {
    public static void main(String[] args) {
        /* Problem 1 -> WAP to store 10 students name using ArrayList */
//        ArrayList<String> al = new ArrayList<String>();
//        al.add("Student 1");
//        al.add("Student 2");
//        al.add("Student 3");
//        al.add("Student 4");
//        al.add("Student 5");
//        al.add("Student 6");
//        al.add("Student 7");
//        al.add("Student 8");
//        al.add("Student 9");
//        al.add("Student 10");
//        for (Object o: al) {        // isse array list ki form main show hogi
//            System.out.println(o);
//        }

        /* problem 2 -> WAP to print date in 18-01-2024 format */
        Date d = new Date();
        int year = 1900 + d.getYear();
        System.out.println("Current date: "+d.getDate()+"-"+(d.getMonth()+1)+"-"+year);
        System.out.println("Current time: "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        /* problem 3 -> repeat problem 2 with the help of Calendar class */
        Calendar cal = Calendar.getInstance();
        System.out.println("Current time: "+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));

        /* Problem 4 -> WAP to store duplicate element inside this set and verify only one instance is stored */
//        HashSet<Integer> hash = new HashSet();
//        hash.add(1);
//        hash.add(40);
//        hash.add(74);
//        hash.add(46);
//        hash.add(4);
//        hash.add(44);
//        hash.add(89);
//        hash.add(4);
//        System.out.println(hash);
    }
}
