public class Throw_Throws {
    // Throws runtime pe hee bata dega ki ArithmeticException aa sakti hai
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    // User defined Exception class
    static class NegativeRadiusException extends Exception {
        // toString() -> predefined method in Exception class
        @Override
        public String toString() {
            return "Radius cannot be negative.";
        }

        // getMessage() -> predefined method in Exception class
        @Override
        public String getMessage() {
            return "Radius cannot be negative.";
        }
    }

    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {
        try {
//            int c = divide(10, 0);
//            System.out.println("Value of c is: " + c);
            double ar = area(-10);
            System.out.println("Area of circle is: "+ar);
        }
        catch (Exception e) {
            System.out.println("Exception\n" + e);
        }
    }
}
