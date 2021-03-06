/* public class Vehicle{
  int wheelsCount;
  boolean hasStorage;
  int numberOfPeople;
  String fuelType;
  
  public Vehicle(int wheelsCount, boolean hasStorage, int numberOfPeople, String fuelType) {
    this.wheelsCount = wheelsCount;
    this.hasStorage = hasStorage;
    this.numberOfPeople = numberOfPeople;
    this.fuelType = fuelType;
  }
  public int getWheelsCount(){
     return wheelsCount;
    }
  
  public void printFuelType() {
      System.out.println("FuelType using parent class: " + fuelType);
  }
}
*/

public class Vehicle {
 int wheelsCount;
 final int DEFAULT_WHEELS_COUNT = 2;
 //private int wheelsCount;
 boolean hasStorage;
 int numberOfPeople;
 
 public Vehicle() {
  /*wheelsCount = DEFAULT_WHEELS_COUNT;
  hasStorage = false;
  numberOfPeople = 2;*/
 }
 
 public Vehicle(int wheelsCount, boolean hasStorage, int numberOfPeople) {
  // DEFAULT_WHEELS_COUNT = 5; cannot assign a value to final variable
  this.wheelsCount = wheelsCount;
  this.hasStorage = hasStorage;
  this.numberOfPeople = numberOfPeople;
 }
 
 public void setWheelsCount(int wheelsCount) {
  this.wheelsCount = wheelsCount;
 }
 
 public int getWheelsCount() {
  return wheelsCount;
 }
 
 public final int getNumberOfPeople() {
  additionOfTwoNumbers(1, 2);
  return numberOfPeople;
 }
 
 public void additionOfTwoNumbers(int a, int b) {
  int c = a + b;
  System.out.println("Added: " + c);
 }
}