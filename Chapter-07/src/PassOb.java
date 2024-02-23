// Objects may be passed to methods.
class Test6 {
    int a, b;

    Test6(int i, int j) {
        a = i;
        b = j;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test6 o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

class PassOb {
    public static void main(String[] args) {
        Test6 ob1 = new Test6(100, 22);
        Test6 ob2 = new Test6(100, 22);
        Test6 ob3 = new Test6(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));

        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
