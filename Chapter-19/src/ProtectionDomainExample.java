import java.security.CodeSource;
import java.security.ProtectionDomain;

public class ProtectionDomainExample {
    public static void main(String[] args) {
        // Get the class object for the String class
        Class<?> cls = String.class;

        // Get the protection domain of the class
        ProtectionDomain protectionDomain = cls.getProtectionDomain();

        // Get the code source associated with the protection domain
        CodeSource codeSource = protectionDomain.getCodeSource();

        // Print information about the protection domain
        System.out.println("Protection Domain: " + protectionDomain);
        System.out.println("Code Source: " + codeSource);
    }
}
