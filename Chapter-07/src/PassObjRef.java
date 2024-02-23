// Objects are passed through their references.

class Test7 {
    int a, b;

    Test7(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test7 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class PassObjRef {
    public static void main(String[] args) {
        Test7 ob = new Test7(15, 20);

        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);
    }
}