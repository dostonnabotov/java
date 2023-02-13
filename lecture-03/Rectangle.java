import java.util.Scanner;

public class Rectangle {
  double x;
  double y;

  // constructor
  public Rectangle(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // static method
  static void beep() {
    System.out.println("Beep...");
  }

  // method
  public double area() {
    return this.x * this.y;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("x: ");
    double x = input.nextFloat();
    System.out.print("y: ");
    double y = input.nextFloat();

    Rectangle rectangle = new Rectangle(x, y);

    if (x == y) beep();

    System.out.println("Area of rectangle: " + rectangle.area());
  }
}
