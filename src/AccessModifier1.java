class c1{
    public int x = 5;
    protected int y = 10;
    int z = 12; // default modifier
    private int a = 20;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AccessModifier1 {
    public static void main(String[] args) {
    c1 c = new c1();
//    c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.a);    through error because 'a' is a private access modifier it cannot access from out of package.
    }
}
