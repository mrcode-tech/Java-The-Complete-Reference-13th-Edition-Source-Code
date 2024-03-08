// A situation that creates a bridge method.
class Gen_1<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen_1(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// A subclass of Gen.
class Gen_2 extends Gen_1<String> {

    Gen_2(String o) {
        super(o);
    }

    // A String-specific override of getOb().
    String getOb() {
        System.out.print("You called String getOb(): ");
        return ob;
    }
}

// Demonstrate a situation that requires a bridge method. 
class BridgeDemo {
    public static void main(String[] args) {

        // Create a Gen2 object for Strings.
        Gen_2 strOb2 = new Gen_2("Generics Test");

        System.out.println(strOb2.getOb());
    }
}