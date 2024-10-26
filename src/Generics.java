import java.util.ArrayList;
class MyGenerics<T1>{
    int val;
    private T1 t1;

    public MyGenerics(int val, T1 t1){
        this.val = val;
        this.t1 =t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add("Str1");
        arrayList.add(10);
        arrayList.add(456);
        int a = arrayList.get(1);
        System.out.println(a);

        MyGenerics<String> g1 = new MyGenerics(10, "I'm a generic String.");
        String str = g1.getT1();
        System.out.println(str);
    }
}
