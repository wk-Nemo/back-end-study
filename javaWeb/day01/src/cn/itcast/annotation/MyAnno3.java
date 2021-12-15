package cn.itcast.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.TYPE,ElementType.FIELD,ElementType.METHOD}) //只能作用于类上
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno3 {

}
