package cn.itcast.reflect;

import cn.itcast.domian.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo3 {
  public static void main(String[] args) throws Exception {
    Class personClass = Person.class;
    Person p = new Person();

    // 获取成员变量
    System.out.println("========getConstructors========");
    Constructor constructor = personClass.getConstructor(String.class, int.class);
    System.out.println(constructor);
    // 创建对象
    Object person = constructor.newInstance("zhangsan", 33);
    System.out.println(person);

    System.out.println("=======getDeclareConstructors=========");
  }
}
