// Demonstrate a raw type.
class Gen6<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen6(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// Demonstrate raw type. 
class RawDemo {
    public static void main(String[] args) {

        // Create a Gen object for Integers.
        Gen6<Integer> iOb = new Gen6<Integer>(88);

        // Create a Gen object for Strings.
        Gen6<String> strOb = new Gen6<String>("Generics Test");

        // Create a raw-type Gen object and give it
        // a Double value.
        Gen6 raw = new Gen6(Double.valueOf(98.6));

        // Cast here is necessary because type is unknown.
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

        // The use of a raw type can lead to run-time.
        // exceptions.  Here are some examples.

        // The following cast causes a run-time error!
//    int i = (Integer) raw.getOb(); // run-time error 

        // This assigment overrides type safety.
        strOb = raw; // OK, but potentially wrong
//    String str = strOb.getOb(); // run-time error  

        // This assingment also overrides type safety.
        raw = iOb; // OK, but potentially wrong
//    d = (Double) raw.getOb(); // run-time error 
    }
}