package junits;

import java.lang.annotation.ElementType;
import java.lang.annotation. *;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("Sanity")
@Disabled
@Test
@DisplayName("Negative Testcase")

public @interface CustomAnnotation {

}
