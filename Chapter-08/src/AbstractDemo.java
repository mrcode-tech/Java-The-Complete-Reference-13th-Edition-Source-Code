// A Simple demonstration of abstract.
abstract class A1 {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class B1 extends A1 {
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}


class AbstractDemo {
    public static void main(String[] args) {
        B1 b = new B1();

        b.callme();
        b.callmetoo();
    }
}