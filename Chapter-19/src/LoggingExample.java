import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoggingExample implements Cloneable {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?>[] fff = Class.forName("LoggingExample").getClasses();
        System.out.println(fff);

        ResourceBundle resourceBundle = ResourceBundle.getBundle("MyResourceBundle");

        // Get a logger with a specific name and resource bundle
        System.Logger logger = System.getLogger("MyLogger",resourceBundle);

        // Log a message using the logger
        logger.log(System.Logger.Level.ERROR,resourceBundle,"error.message", new Exception("test error"));

        System.out.println(System.getProperties());
        /**
         * {java.specification.version=21,
         * sun.cpu.isalist=amd64,
         * sun.jnu.encoding=Cp1256,
         * java.class.path=F:\MyProject\Java-The-Complete-Reference-13th-Edition-Source-Code\out\production\Chapter-19,
         * java.vm.vendor=Oracle Corporation,
         * sun.arch.data.model=64,
         * user.variant=,
         * java.vendor.url=https://java.oracle.com/,
         * java.vm.specification.version=21,
         * os.name=Windows 10,
         * sun.java.launcher=SUN_STANDARD,
         * user.country=US,
         * sun.boot.library.path=C:\Program Files\Java\jdk-21\bin,
         * sun.java.command=ACDemo,
         * jdk.debug=release,
         * sun.cpu.endian=little,
         * user.home=C:\Users\m_nakhjiri,
         * user.language=en,
         * sun.stderr.encoding=UTF-8,
         * java.specification.vendor=Oracle Corporation,
         * java.version.date=2024-01-16,
         * java.home=C:\Program Files\Java\jdk-21,
         * file.separator=\,
         * java.vm.compressedOopsMode=Zero based,
         * sun.stdout.encoding=UTF-8,
         * line.separator=,
         * java.vm.specification.vendor=Oracle Corporation,
         * java.specification.name=Java Platform API Specification,
         * user.script=, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.runtime.version=21.0.2+13-LTS-58,
         * user.name=m_nakhjiri,
         * stdout.encoding=UTF-8,
         * path.separator=;,
         * os.version=10.0,
         * java.runtime.name=Java(TM) SE Runtime Environment,
         * file.encoding=UTF-8,
         * java.vm.name=Java HotSpot(TM) 64-Bit Server VM,
         * java.vendor.url.bug=https://bugreport.java.com/bugreport/,
         * java.io.tmpdir=C:\Users\M_NAKH~1\AppData\Local\Temp\,
         * java.version=21.0.2,
         * user.dir=F:\MyProject\Java-The-Complete-Reference-13th-Edition-Source-Code, os.arch=amd64,
         * java.vm.specification.name=Java Virtual Machine Specification, sun.os.patch.level=, native.encoding=Cp1256,
         * java.library.path=C:\Program Files\Java\jdk-21\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Windows\system32\;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\ProgramData\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\OpenSSL-Win32\bin;C:\Program Files (x86)\IBM\Personal Communications\;C:\Program Files (x86)\IBM\Trace Facility\;C:\Program Files\Git\cmd;C:\Program Files\nodejs\;C:\Program Files\Docker\Docker\resources\bin;C:\ProgramData\chocolatey\bin;C:\Users\m_nakhjiri\AppData\Local\Programs\Python\Python312\Scripts\;C:\Users\m_nakhjiri\AppData\Local\Programs\Python\Python312\;C:\Users\m_nakhjiri\scoop\shims;C:\Users\m_nakhjiri\AppData\Local\pnpm;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\m_nakhjiri\AppData\Local\Microsoft\WindowsApps;C:\Program Files\Java\jdk-21\bin;C:\Users\m_nakhjiri\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\m_nakhjiri\Desktop\Electron\FFmpeg\bin;C:\Program Files\nodejs;F:\apache-maven-3.8.6\bin;C:\Users\m_nakhjiri\AppData\Local\GitHubDesktop\bin;C:\Users\m_nakhjiri\AppData\Roaming\npm;F:\coureses\Tools\spring-boot\spring-boot-cli-3.1.4-bin\spring-3.1.4\bin;E:\Gradle\gradle-8.7\bin;;.,
         * java.vm.info=mixed mode, sharing,
         * stderr.encoding=UTF-8,
         * java.vendor=Oracle Corporation,
         * java.vm.version=21.0.2+13-LTS-58,
         * sun.io.unicode.encoding=UnicodeLittle, java.class.version=65.0}
         */
    }
    public class asdfasf {

    }
}
