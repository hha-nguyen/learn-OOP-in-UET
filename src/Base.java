public abstract class Base {
    public abstract void f1();
    public abstract void f2();
    public void f3() {
        f1();
        f2();
    }

    public static void main(String[] args) {
        Derlived d = new Derlived();
        d.f3();
    }
}


