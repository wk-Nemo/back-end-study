package cn.itcast.reflect;

import cn.itcast.domian.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
  public static void main(String[] args) throws Exception {
    Class personClass = Person.class;
    Person p = new Person();

    // 获取成员变量
    System.out.println("========getFields========");
    Field[] fileds = personClass.getFields();
    for(Field field: fileds) {
      System.out.println(field);
    }

    System.out.println("---------------");
    Field a = personClass.getField("a");
    Object value = a.get(p);
    System.out.println(value);
    a.set(p, "张三");
    System.out.println(p);

    System.out.println("=======getDeclaredFields=========");
    Field[] declareFileds = personClass.getDeclaredFields();
    for(Field field: declareFileds) {
      System.out.println(field);
    }

    System.out.println("---------------");
    Field name = personClass.getDeclaredField("name");
    // 直接访问private会报错，该设置可以忽略权限修饰符的安全检查
    name.setAccessible(true); // 暴力反射
    Object value2 = name.get(p);
    System.out.println(value2);
    name.set(p, "wk");
    System.out.println(p);
  }
}
