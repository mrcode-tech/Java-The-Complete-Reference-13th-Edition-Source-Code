// Returning an object.
class Test1 {
    int a;

    Test1(int i) {
        a = i;
    }

    Test1 incrByTen() {
        Test1 temp = new Test1(a + 10);
        return temp;
    }
}

class RetOb {
    public static void main(String[] args) {
        Test1 ob1 = new Test1(2);
        Test1 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: "
                + ob2.a);
    }
}