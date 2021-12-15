package cn.itcast.annotation;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Properties;

@Pro(className = "cn.itcast.annotation.Demo1", methodName = "show")
public class ReflectTest {
  public static void main(String[] args) throws Exception {
    // 1. 解析注解
    // 1.1 获取该类的字节码文件
    Class<ReflectTest> reflectTestClass = ReflectTest.class;

    // 2. 获取上边的注解对象
    Pro an = reflectTestClass.getAnnotation(Pro.class);

    // 3. 调用注解中的抽象方法，获取返回值
    String className = an.className();
    String methodName = an.methodName();
    System.out.println(className);
    System.out.println(methodName);

    // 4. 加载该类进内存
    Class cls = Class.forName(className);

    // 5.创建对象
    Object obj = cls.newInstance();

    // 6. 获取方法对象
    Method method = cls.getMethod(methodName);

    // 7. 执行方法
    method.invoke(obj);
  }
}
