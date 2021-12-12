package interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
  public static void main(String[] args) {
    Employee[] staff = new Employee[3];

    staff[0] = new Employee("sb", 8000);
    staff[1] = new Employee("cy", 5000);
    staff[2] = new Employee("xz", 10000);

    Arrays.sort(staff);

    for(Employee e: staff) {
      System.out.println("name:" + e.getName() + " salary:" + e.getSalary());
    }
  }
}
