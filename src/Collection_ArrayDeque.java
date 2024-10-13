import java.util.ArrayDeque;

public class Collection_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>  ad = new ArrayDeque<>();
        ad.add(1);
        ad.add(5);
        ad.add(54);
        ad.addFirst(10);    // addFirst() method First index pe value ko add kar deta hai
        System.out.println(ad.getFirst());  // getFirst() method ArrayDeque ke first element ko print karega
        System.out.println(ad.getLast());   // getLast() method ArrayDeque ke last element ko print karega
        System.out.println(ad.getClass());  // getClass() method batata hai ki ArrayDeque konsi class ke andar aata hai
    }
}
