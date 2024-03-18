// Demonstrate Runtime.Version release counters.
class VerDemo {
    public static void main(String[] args) {

        System.out.println("Character.BYTES : " + Character.BYTES);
        System.out.println("Character.MAX_RADIX : " + Character.MAX_RADIX);
        System.out.println("Character.MIN_RADIX : " + Character.MIN_RADIX);
        System.out.println("Character.MAX_VALUE : " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE : " + Character.MIN_VALUE);
        System.out.println("Character.TYPE : " + Character.TYPE);

        Character.isTitleCase('a');
        Character.isUpperCase('a');



        int num = 37; // Binary representation: 100101
        Long l = 1123l;
        Long ll = Long.reverseBytes(l);
        System.out.println(Byte.BYTES);
        System.out.println(Short.BYTES);
        System.out.println(Integer.BYTES);
        System.out.println(Double.BYTES);
        System.out.println(Long.TYPE);

        System.out.println("l is " + l.byteValue());
        System.out.println(Long.bitCount(1023)); //10 -> 1111111111

        int highestOneBit = Integer.highestOneBit(num);

        System.out.println("highestOneBit number: " + highestOneBit);
        System.out.println("Original number: " + num);
        System.out.println("Binary representation: " + Integer.toBinaryString(num));
        System.out.println("Highest one bit position: " + Integer.numberOfTrailingZeros(highestOneBit));





        Runtime.Version ver = Runtime.version();

        // Display individual counters.
        System.out.println("Feature release counter: " + ver.feature());
        System.out.println("Interim release counter: " + ver.interim());
        System.out.println("Update release counter: " + ver.update());
        System.out.println("Patch release counter: " + ver.patch());

        System.out.println("optional release counter: " + ver.optional().get());

        System.out.println("build release counter: " + ver.build().get());
        System.out.println("Patch release counter: " + ver.pre().get());
    }
}