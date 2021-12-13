package cn.itcast.test;

import cn.itcast.junit.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
  /**
   * 初始化方法
   * 用于资源申请所有测试方法执行之前都会执行
   */
  @Before
  public void init() {
    System.out.println("init");
  }

  /**
   * 释放资源方法
   * 所有测试方法执行完后，都会执行该方法
   */
  @After
  public void close() {
    System.out.println("close");
  }

  /**
   * 测试add
   */
  @Test
  public void testAdd() {
    Calculator c = new Calculator();
    int result = c.add(1, 2);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testSub() {
    Calculator c = new Calculator();
    int result = c.sub(1, 2);
    Assert.assertEquals(-1, result);
  }
}
