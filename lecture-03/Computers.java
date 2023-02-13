public class Computers {
  int ram = 8;
  int ssd = 256;
  String cpu = "Intel Core i7";

  public static void main(String[] args) {
    Computers hp = new Computers();
    Computers dell = new Computers();

    dell.ssd = 512;

    int totalSsdSize = hp.ssd + dell.ssd;
    System.out.println("Total SSD size: " + totalSsdSize);
  }
}
