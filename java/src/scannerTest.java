import java.util.Scanner;

public class scannerTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("what's your name?");
    String name = in.nextLine();

    System.out.print("How old are you?");
    int age = in.nextInt();

    System.out.print("Hello, " + name + ". next year, you will be " + (age + 1));
  }
}
