import java.util.*;

public class Bicycle {
  public int cadence;
  public int gear;
  public int speed;
  public String name;

  public Bicycle(BicycleConfigs bikeConfigs) {
    cadence = bikeConfigs.cadence;
    gear = bikeConfigs.gear;
    speed = bikeConfigs.speed;
    name = bikeConfigs.name;
  }

  public void status() {
    System.out.println(String.format("\n=======[ %s Status ]========", name));
    System.out.println(String.format("Gear at: %d", gear));
    System.out.println(String.format("Speed at: %d", speed));
    System.out.println(String.format("Gear at: %d", cadence));
    System.out.println("\n==============================");
  }

  public void setSpeed(int newSpeed) {
    this.speed = newSpeed;
  }

  public static void main(String[] args) {
    BicycleConfigs bikeConfigs = new BicycleConfigs();
    bikeConfigs.cadence = 3;
    bikeConfigs.gear = 4;
    bikeConfigs.speed = 5;
    bikeConfigs.name = "Mountaineer";
    Bicycle bike = new Bicycle(bikeConfigs);
    bike.status();
    bike.setSpeed(20);
    bike.status();
  }
}
