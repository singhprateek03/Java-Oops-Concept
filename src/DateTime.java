public class DateTime {
    public static void main(String[] args) {
        // For MilliSeconds
        System.out.println("MilliSecond: "+System.currentTimeMillis()); // currentTimeMillis() method batata hai (19-Jan-1970 to current) date tak kitne millisecond beet chuke hai
        // To find years since (19-Jan-1970 to Current)
        System.out.println("Years: "+System.currentTimeMillis()/1000/3600/24/365);
        // For Hours
        System.out.println("Hours: "+System.currentTimeMillis()/3600000);
    }
}
