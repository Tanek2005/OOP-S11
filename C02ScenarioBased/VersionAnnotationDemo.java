import java.lang.annotation.*;
import java.lang.reflect.*;

// Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Version {
    String author();
    String date();
}

@Version(author = "Prof. Tanek", date = "2025-11-07")
class VersionedClass {
    @Version(author = "Assistant Niggesh", date = "2025-11-07")
    public void show() {
        System.out.println("Inside VersionedClass show() method.");
    }
}

public class VersionAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Class<VersionedClass> obj = VersionedClass.class;

        if (obj.isAnnotationPresent(Version.class)) {
            Version v = obj.getAnnotation(Version.class);
            System.out.println("Class Annotation -> Author: " + v.author() + ", Date: " + v.date());
        }

        Method m = obj.getMethod("show");
        if (m.isAnnotationPresent(Version.class)) {
            Version v2 = m.getAnnotation(Version.class);
            System.out.println("Method Annotation -> Author: " + v2.author() + ", Date: " + v2.date());
        }
    }
}