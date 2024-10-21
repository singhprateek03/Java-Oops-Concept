class NewPhone extends Phone{
    // 1. Override annotation
    @Override
    public void ShowTime(){
        System.out.println("Time is 8 PM");
    }

    // 2. Deprecated annotation
    @Deprecated     // Yeah annotation deprecate warning dega
    public int sum(int a, int b){
        return a+b;
    }

    // 3. FunctionalInterface annotation  // iss main hum sirf method ko hee rakh sakte hai
    @FunctionalInterface
    interface myFunctionalInterface{
        void thisMethod();
//        void thisMethod2();
    }
}
public class JavaAnnotations {
    // 4. SuppressWarnings annotation
    @SuppressWarnings("Deprecation")    // Yeah annotation deprecate warning ko hata dega
    public static void main(String[] args) {
    NewPhone phone = new NewPhone();
    phone.ShowTime();
    System.out.println("The sum is: "+phone.sum(10,20));
    }
}


