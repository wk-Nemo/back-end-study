package chapterFive;

public class ManagerTest {
  public static void main(String[] args) {
    Manager boss = new Manager("wk", 8000, 2021, 12, 11);
    boss.setBonus(5000);

    Employee[] staff = new Employee[3];

    staff[0] = boss;
    staff[1] = new Employee("cy", 5000, 2000, 8, 16);
    staff[2] = new Employee("xz", 10000, 2000, 4, 30);

    for(Employee e: staff) {
      System.out.println("name:" + e.getName() + " hireDay:" + e.getHireDay() + " salary:" + e.getSalary());
      System.out.println(e.toString());
    }
  }
}
