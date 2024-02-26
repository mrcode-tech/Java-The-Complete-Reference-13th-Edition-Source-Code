// Demonstrate a repeated annotation.

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Make MyAnno repeatable
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno3 {
    String str() default "Testing";

    int val() default 9000;
}

// This is the container annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno3[] value();
}

class RepeatAnno {

    // Repeat MyAnno on myMeth().
    @MyAnno3(str = "First annotation", val = -1)
    @MyAnno3(str = "Second annotation", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            // Obtain the annotations for myMeth().
            Method m = c.getMethod("myMeth", String.class, int.class);

            // Display the repeated MyAnno annotations.
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);

        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
