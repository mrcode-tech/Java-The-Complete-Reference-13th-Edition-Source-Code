// Demonstrate Run-Time Type Information.

class X {
    int a;
    float b;
}

class Y extends X {
    double c;
}
record Person(String name, String family){

}
class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;


        clObj = x.getClass(); // get Class reference
        System.out.println("x is object of type: " +
                clObj.getName());


        clObj = y.getClass(); // get Class reference
        System.out.println("y is object of type: " +
                clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println("y's superclass is " +
                clObj.getName());

        Person person = new Person("mehdi", "njr");
        clObj = person.getClass();

        clObj.getRecordComponents();

        System.out.println("getNestMembers count nested member : " + RTTI.class.getNestMembers().length);
        System.out.println("getNestHost nested member : " + RTTI.class.getNestHost());
        System.out.println("isNestmateOf nested member : " + RTTI.class.isNestmateOf(X.class));
        System.out.println("isNestmateOf nested member : " + RTTI.class.isNestmateOf(A.class));


        System.out.println(Math.nextAfter(1.01,2)); //1.0100000000000002
        System.out.println(Math.nextUp(1)); //1.0000001
        System.out.println(Math.nextDown(1)); //0.99999994
        System.out.println(Math.nextUp(1)); //1.0000001
        System.out.println(Math.rint(1.001)); //1.0
        System.out.println(Math.ulp(1)); //1.1920929E-7



    }
    class A{

    }
}