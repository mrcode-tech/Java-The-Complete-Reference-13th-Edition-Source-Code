public class InstanceOfDemo {

    public static void main(String[] args) {
        Number num = Integer.valueOf(100);

        if (num instanceof Integer numInt) {
            System.out.println("numInt is of type: " + numInt.getClass());
        }

        if (num instanceof Integer numInt && numInt < 1000) {
            System.out.println("Number less than 1000");
        }

        //Pattern Matching in Other Statements
        Object[] someObjs = {
                new String("Alpha"),
                new String("Beta"),
                Integer.valueOf(10),
                new String("Omega")

        };

        int i;
        // This loop iterates until an element is not a String, or the end
        // of the array is reached.
        for(i = 0; (someObjs[i] instanceof String str) && (i < someObjs.length); i++) {
            System.out.println("Processing " + str);
            // ...
        }

    }
}
