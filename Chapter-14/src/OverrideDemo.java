// Overriding a generic method in a generic class.
class Gen_0000<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen_0000(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        System.out.print("Gen's getOb(): ");
        return ob;
    }
}

// A subclass of Gen that overrides getOb().
class Gen_0002<T> extends Gen_0000<T> {

    Gen_0002(T o) {
        super(o);
    }

    // Override getOb().
    T getOb() {
        System.out.print("Gen2's getOb(): ");
        return ob;
    }
}

// Demonstrate generic method override.
class OverrideDemo {
    public static void main(String[] args) {

        // Create a Gen object for Integers.
        Gen_0000<Integer> iOb = new Gen_0000<Integer>(88);

        // Create a Gen2 object for Integers.
        Gen_0002<Integer> iOb2 = new Gen_0002<Integer>(99);

        // Create a Gen2 object for Strings.
        Gen_0002<String> strOb2 = new Gen_0002<String>("Generics Test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}