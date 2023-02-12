import java.io.Console;

public class Students {
  String fname;
  int age = 18;
  double height = 1.8;

  public void doAssignments() {
    System.out.println("Do assignments");
  }

  // constructor
  public Students(String name) {
    fname = name;
  }

  public static void main(String[] args) {
    Students john = new Students("John");
    System.out.println(john.fname + "'s age: " + john.age);

    Students anna = new Students("Anna");
    anna.age = 19;
    System.out.println(anna.fname + "'s age: " + anna.age);
  }
}