package cn.itcast.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
  public static void main(String[] args) throws IOException, Exception {
    // 可以帮我们创造任意类的对象，并执行其中任意方法

    // 1. 加载配置文件
    // 1.1 创建 Properties 对象
    Properties pro = new Properties();
    // 1.2 加载配置文件， 转换成一个集合
    ClassLoader classLoader = ReflectTest.class.getClassLoader();
    InputStream is = classLoader.getResourceAsStream("pro.properties");
    pro.load(is);

    // 2. 获取配置文件中的定义数据
    String className = pro.getProperty("className");
    String methodName = pro.getProperty("methodName");

    // 3. 加载该类进内存
    Class cls = Class.forName(className);

    // 4.创建对象
    Object obj = cls.newInstance();

    // 5. 获取方法对象
    Method method = cls.getMethod(methodName);

    // 6. 执行方法
    method.invoke(obj);
  }
}
