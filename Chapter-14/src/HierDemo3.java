// Use the instanceof operator with a generic class hierarchy.
class Gen_000<T> {
    T ob;

    Gen_000(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// A subclass of Gen.
class Gen_02<T> extends Gen_000<T> {
    Gen_02(T o) {
        super(o);
    }
}

// Demonstrate run-time type ID implications of generic 
// class hierarchy. 
class HierDemo3 {
    public static void main(String[] args) {

        // Create a Gen object for Integers.
        Gen_000<Integer> iOb = new Gen_000<Integer>(88);

        // Create a Gen2 object for Integers.
        Gen_02<Integer> iOb2 = new Gen_02<Integer>(99);

        // Create a Gen2 object for Strings.
        Gen_02<String> strOb2 = new Gen_02<String>("Generics Test");

        // See if iOb2 is some form of Gen2.
        if (iOb2 instanceof Gen_02<?>)
            System.out.println("iOb2 is instance of Gen2");

        // See if iOb2 is some form of Gen.
        if (iOb2 instanceof Gen_000<?>)
            System.out.println("iOb2 is instance of Gen");

        System.out.println();

        // See if strOb2 is a Gen2.
        if (strOb2 instanceof Gen_02<?>)
            System.out.println("strOb is instance of Gen2");

        // See if strOb2 is a Gen.
        if (strOb2 instanceof Gen_000<?>)
            System.out.println("strOb is instance of Gen");

        System.out.println();

        // See if iOb is an instance of Gen2, which it is not.
        if (iOb instanceof Gen_02<?>)
            System.out.println("iOb is instance of Gen2");

        // See if iOb is an instance of Gen, which it is.
        if (iOb instanceof Gen_000<?>)
            System.out.println("iOb is instance of Gen");
    }
}
