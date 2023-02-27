import java.util.Scanner;

/**
 * Task 1
 * - Create abstract class with 2 subclasses
 * - Ask user for the price of gasoline
 * - Calculate the cost of travelling 
 */
abstract class Vehicle {
  protected final int DISTANCE = 155;
  public abstract void showExpenses(double price);
}

class Car extends Vehicle {
  double FUEL_CONSUMPTION = 5;
  
  public void showExpenses(double price) {
    double cost = price * (FUEL_CONSUMPTION / 100) * DISTANCE;
    System.out.printf("Cost of travelling by car for %2$d km: %1$.2f euro \n", cost, DISTANCE);
  }
}

class Bus extends Vehicle {
  double FUEL_CONSUMPTION = 10;
  
  public void showExpenses(double price) {
    double cost = price * (FUEL_CONSUMPTION / 100) * DISTANCE;
    System.out.printf("Cost of travelling by bus for %2$d km: %1$.2f euro \n", cost, DISTANCE);
  }
}

public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Price of gasoline: ");
  double price = input.nextDouble();
  
  Car car = new Car();
  Bus bus = new Bus();
  
  car.showExpenses(price);
  bus.showExpenses(price);
 }
}
