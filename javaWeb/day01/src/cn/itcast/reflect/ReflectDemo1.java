package cn.itcast.reflect;

import cn.itcast.domian.Person;

public class ReflectDemo1 {
  public static void main(String[] args) throws Exception {
    Class cls1 = Class.forName("cn.itcast.domian.Person");
    System.out.println(cls1);

    Class cls2 = Person.class;
    System.out.println(cls2);

    Person p = new Person();
    Class cls3 = p.getClass();
    System.out.println(cls3);

    System.out.println(cls1 == cls2); // true
    System.out.println(cls1 == cls3); // true
  }
}
