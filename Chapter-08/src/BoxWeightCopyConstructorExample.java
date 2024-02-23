class BoxWeight1 extends Box {
    double weight; // weight of box

    // construct clone of an object
    BoxWeight1(BoxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }
}