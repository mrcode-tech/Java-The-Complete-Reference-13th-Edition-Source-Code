// Use a method reference to help find the maximum value in a collection.

import java.util.ArrayList;
import java.util.Collections;

class MyClass11 {
    private int val;

    MyClass11(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

class UseMethodRef11 {
    // A compare() method compatible with the one defined by Comparator<T>.
    static int compareMC(MyClass11 a, MyClass11 b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass11> al = new ArrayList<MyClass11>();

        al.add(new MyClass11(1));
        al.add(new MyClass11(4));
        al.add(new MyClass11(2));
        al.add(new MyClass11(9));
        al.add(new MyClass11(3));
        al.add(new MyClass11(7));

        // Find the maximum value in al using the compareMC() method.
        MyClass11 maxValObj = Collections.max(al, UseMethodRef11::compareMC);

        System.out.println("Maximum value is: " + maxValObj.getVal());
    }
}