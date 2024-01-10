package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解的应用演示
 * <p>
 * 常见的值：
 * TYPE 类上,接口上使用
 * FILED 属性上使用
 */
//@Target({ElementType.TYPE, ElementType.FIELD})
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//保留级别
public @interface AutoRunClass {
}
