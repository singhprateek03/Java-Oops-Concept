import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add("Str1");
        arrayList.add(10);
        arrayList.add(456);
        int a = arrayList.get(1);
        System.out.println(a);
    }
}
