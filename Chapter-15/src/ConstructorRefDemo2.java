// Demonstrate a constructor reference with a generic class.

// MyFunc is now a generic functional interface.
interface MyFunc2<T> {
    MyClass2<T> func(T n);
}

class MyClass2<T> {
    private T val;

    // A constructor that takes an argument.
    MyClass2(T v) {
        val = v;
    }

    // This is the default constructor.
    MyClass2() {
        val = null;
    }

    // ...

    T getVal() {
        return val;
    }

    ;
}

class ConstructorRefDemo2 {

    public static void main(String[] args) {
        // Create a reference to the MyClass<T> constructor.
        MyFunc2<Integer> myClassCons = MyClass2<Integer>::new;

        // Create an instance of MyClass<T> via that constructor reference.
        MyClass2<Integer> mc = myClassCons.func(100);

        // Use the instance of MyClass<T> just created.
        System.out.println("val in mc is " + mc.getVal());
    }
}
