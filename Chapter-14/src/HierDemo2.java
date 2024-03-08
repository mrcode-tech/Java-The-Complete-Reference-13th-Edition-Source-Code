// A nongeneric class can be the superclass
// of a generic subclass.

// A nongeneric class.
class NonGen1 {
    int num;

    NonGen1(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}

// A generic subclass.
class Gen_10<T> extends NonGen1 {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen_10(T o, int i) {
        super(i);
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// Create a Gen object. 
class HierDemo2 {
    public static void main(String[] args) {

        // Create a Gen object for String.
        Gen_10<String> w = new Gen_10<String>("Hello", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getnum());
    }
}