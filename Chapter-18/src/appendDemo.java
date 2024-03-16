import java.util.Arrays;
import java.util.Locale;

// Demonstrate append().
class appendDemo {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Hello \uD83D\uDE00 World"); // StringBuffer containing the "smiling face" emoji

        // Find the index of the character after the space character
        int startIndex = 6; // Index of the space character after "Hello"
        int offset = 2; // Number of code points to offset
        int newIndex = buffer.offsetByCodePoints(startIndex, offset);

        System.out.println("New Index: " + newIndex); // Output: 9 (Index of the "W" character)

        ///////////////////////////

        String str = "apple,banana,,cherry,";
        String[] parts = str.split(",", -1);
        System.out.println(Arrays.toString(parts)); // [apple, banana, , cherry, ]

        String[] parts2 = str.split(",", 0);
        System.out.println(Arrays.toString(parts2)); // [apple, banana, , cherry]

        String[] parts3 = str.split(",", 2); // parts3.length
        System.out.println(Arrays.toString(parts3)); // [apple, banana, , cherry]

        String input = "Hello";
        String inputUpper = input.transform(x -> x.toUpperCase());
        System.out.println(inputUpper); // Output: "HELLO"


        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(10);

        sb.append("asfasfasfasgfasgasgasgasgasgagagsssssssssssssssssssssssssssssssss12345678901234567");
        sb.ensureCapacity(100);
        s = sb.append(" a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}