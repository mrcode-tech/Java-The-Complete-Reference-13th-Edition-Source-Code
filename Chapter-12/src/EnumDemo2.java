// Use the built-in enumeration methods.

// An enumeration of apple varieties.
enum Apple2 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}


class EnumDemo2 {
    public static void main(String[] args) {
        Apple2 ap;

        System.out.println("Here are all Apple constants");

        // use values()
        Apple2[] allapples = Apple2.values();
        for (Apple2 a : allapples)
            System.out.println(a);

        System.out.println();

        // use valueOf()
        ap = Apple2.valueOf("Winesap");
        System.out.println("ap contains " + ap);

    }
}
