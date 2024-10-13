import java.util.HashSet;
public class Collection_Set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        // Set Collection means unique value in the Index.
        myHashSet.add(10);
        myHashSet.add(45);
        myHashSet.add(56);
        myHashSet.add(56);
        System.out.print(myHashSet);
    }
}
