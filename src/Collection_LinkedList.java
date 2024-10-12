import java.util.*;

public class Collection_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(10);
        l1.add(40);
        l1.add(8);
        l1.add(54);
        l1.add(65);
        l1.addFirst(1);     // firstLast() method LinkedList ke starting main given element ko add kar dega
        l1.addLast(100);    // addLast() method LinkedList ke last main given element ko add kar dega
        l1.add(0,89); // Agar same index pe element add karenge toh wo next index pe shift ho jayega
        l1.add(0,90);

        l2.add(2);
        l2.add(5);
        l2.add(8);
        l2.add(6);
        l2.add(7);
        l2.add(2);
        l2.add(3);

        /* LinkedList methods */
        l1.addAll(0, l2);  // index value dene se l2 ke elements phele add honge than l1 ke elements add honge
//        l1.addAll(l2);  // addAll() method l1 and l2 ke saare elements ko add kar dega
//        l1.clear();   // Clear() method saare elements ko clear kar dega
//        l1.set(2,80);   // set() method given index pe value ko set kar deta hai
//        System.out.println(l1.contains(100));    // contains() method check karta hai ki given element LinkedList main hai ki nhi hai
//        System.out.println("Element present at index: "+l1.indexOf(8));     // indexOf() method batata hai element konse index par hai
//        System.out.println("Element Last at index: "+l1.lastIndexOf(8));   //  lastIndexOf() method batata hai ki element last time kis index pe aaya tha
//        System.out.println(l1.remove(5));   // remove() method given index se value ko remove kar deta hai

        for(int i=0; i< l1.size();i++){
            // get() method LinkedList ke element to print karwane ke liye use ho rha hai
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
