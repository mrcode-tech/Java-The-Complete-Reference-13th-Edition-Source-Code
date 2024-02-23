/* A program that uses the Box class.

   Call this file BoxDemo.java
*/
class Box3 {
    double width;
    double height;
    double depth;
}

// This class declares an object of type Box.
class BoxDemo {

    public static void main(String[] args) {
        Box3 mybox = new Box3();
        double vol;

        // assign values to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // compute volume of box
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume is " + vol);
    }
}