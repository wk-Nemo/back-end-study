package clone;

public class CloneTest {
  public static void main(String[] args) throws CloneNotSupportedException {
    Employee original = new Employee("john", 5000);
    original.setHireDay(2000, 1, 1);
    Employee copy = original.clone();
    copy.raiseSalary(10);
    copy.setHireDay(2001, 4, 30);
    System.out.println("original = " + original);
    System.out.println("copy = " + copy);
  }
}
