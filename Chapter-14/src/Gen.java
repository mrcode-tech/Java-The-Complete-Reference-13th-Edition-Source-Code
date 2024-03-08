// A simple generic class hierarchy. 
class Gen_0<T> {
    T ob;

    Gen_0(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// A subclass of Gen. 
class Gen_00<T> extends Gen_0<T> {
    Gen_00(T o) {
        super(o);
    }
}