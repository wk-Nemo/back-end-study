package cn.itcast.annotation;

public @interface MyAnno {
//  int show1();
//  String show2();
//
//  Person per();
//  MyAnno2 anno2();
//
//  String[] strs();
  int age();
  String name() default "wk";
}
