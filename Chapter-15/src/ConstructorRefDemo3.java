// Implement a simple class factory using a constructor reference.

interface MyFunc12<R, T> {
    R func(T n);
}

// A simple generic class.
class MyClass12<T> {
    private T val;

    // A constructor that takes an argument.
    MyClass12(T v) {
        val = v;
    }

    // The default constructor. This constructor
    // is NOT used by this program.
    MyClass12() {
        val = null;
    }
    // ...

    T getVal() {
        return val;
    }

    ;
}

// A simple, non-generic class.
class MyClass13 {
    String str;

    // A constructor that takes an argument.
    MyClass13(String s) {
        str = s;
    }

    // The default constructor. This
    // constructor is NOT used by this program.
    MyClass13() {
        str = "";
    }

    // ...

    String getVal() {
        return str;
    }

    ;
}

class ConstructorRefDemo3 {

    // A factory method for class objects. The class must
    // have a constructor that takes one parameter of type T.
    // R specifies the type of object being created.
    static <R, T> R myClassFactory(MyFunc12<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Create a reference to a MyClass constructor.
        // In this case, new refers to the constructor that
        // takes an argument.
        MyFunc12<MyClass12<Double>, Double> myClassCons = MyClass12<Double>::new;

        // Create an instance of MyClass by use of the factory method.
        MyClass12<Double> mc = myClassFactory(myClassCons, 100.1);

        // Use the instance of MyClass just created.
        System.out.println("val in mc is " + mc.getVal());

        // Now, create a different class by use of myClassFactory().
        MyFunc12<MyClass13, String> myClassCons2 = MyClass13::new;

        // Create an instance of MyClass by use of the factory method.
        MyClass13 mc2 = myClassFactory(myClassCons2, "Lambda");

        // Use the instance of MyClass just created.
        System.out.println("str in mc2 is " + mc2.getVal());
    }
}