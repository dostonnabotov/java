import java.util.Random;

public class Car {
    int wheels = 4;
    String engine = "gasoline";
    double consumption;

    public Car(double consumption) {
        this.consumption = consumption;
    }

    public void drive(int distance, double price, int volume) {
        double fuelConsumed = (consumption / 100) * distance;

        if (fuelConsumed <= volume) {
            double cost = price * fuelConsumed;
            System.out.println("Cost of travelling " + distance + "km is $" + cost);
        } else {
            System.out.println("Not enough fuel");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int distance = random.nextInt(1000);

        Gasoline gasoline = new Gasoline();
        Diesel diesel = new Diesel();

        Car car1 = new Car(10);
        Car car2 = new Car(9);

        car1.drive(distance, gasoline.price, gasoline.volume);
        car2.drive(distance, diesel.price, diesel.volume);
    }
}