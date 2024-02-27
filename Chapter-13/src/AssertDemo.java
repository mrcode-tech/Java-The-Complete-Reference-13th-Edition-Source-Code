// Demonstrate assert. 
class AssertDemo {
    static int val = 3;

    // Return an integer.
    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        //To enable assertion checking at run time, you must specify the -ea option.
        //For example, to enable assertions for AssertDemo, execute it using this
        //line:
        //java -ea AssertDemo
        for (int i = 0; i < 10; i++) {
            n = getnum();

            assert n > 0; // will fail when n is 0

            System.out.println("n is " + n);
        }
    }
}