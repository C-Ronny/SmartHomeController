public class Device {

  // Instance Variables
  private String name;
  private boolean isOn;

  // Constructor
  public Device(String name){
    this.name = name;
  }

  public Device(){}

  // Accessor methods
  public String getName(){
    return this.name;
  }

  // Class Method Definitions
  public void turnOn(){}

  public void turnOff(){}

  public boolean isOn(){
    if (isOn == true){
      return true;
    } else {
      return false;
    }
  }





}