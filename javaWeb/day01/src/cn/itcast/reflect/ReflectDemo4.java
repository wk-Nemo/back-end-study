package cn.itcast.reflect;

import cn.itcast.domian.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {
  public static void main(String[] args) throws Exception {
    Class personClass = Person.class;
    Person p = new Person();

    // 获取成员变量
    System.out.println("========getMethods========");
    Method[] methods = personClass.getMethods();
    for(Method m: methods) {
      System.out.println(m);
    }

    System.out.println("-----------------");
    Method eat_Method = personClass.getMethod("eat");
    eat_Method.invoke(p);

    Method eat_Method2 = personClass.getMethod("eat", String.class);
    eat_Method2.invoke(p,"apple");


    System.out.println("=======getDeclareConstructors=========");
    System.out.println("省略。。");
  }
}
