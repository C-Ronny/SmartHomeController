import java.util.ArrayList;

public class Room{

  // Instance Variables
  private String name;
  private ArrayList<Device> devices = new ArrayList<Device>();
  private int deviceCount = 0;

  // Constructor
  public Room(String name){
    this.name = name;
    this.devices = new ArrayList<Device>();
  }

  // Accessor methods

  // Return the list of devices.
  public void getDevices(){
    System.out.println("Devices:"); 
    for (int i=0; i<devices.size(); i++){
      System.out.println(i + ". " + devices.get(i).getName());
    }
  }

  // Return the room’s name
  public String getName(){
    return this.name;
  }

  // Return the number of devices in the room
  public String getDeviceCount(){
    return (deviceCount == 0) ? "There are no devices in the " + getName() + " room." : "There are " + deviceCount + " devices in the room.";
  }


  // Mutator methods

  public void setName(String name){
    this.name = name;
  }


  
  // Class Method Definitions


  // Add a device to the room.
  public void addDevice(Device device){
    devices.add(device);
    deviceCount++;
    System.out.println(device.getName() + " successfully added to the " + getName()  + " room.");
  } 
  
  // Turn on all devices in the room.
  public void turnOnAll(){
    for(Device device : devices){
      device.turnOn();
    }
    System.out.println("All devices in " + getName() + " have been turned on.");
  }

  //  Turn off all devices in the room.
  public void turnOffAll(){
    for(Device device : devices){
      device.turnOff();
    }
    System.out.println("All devices in " + getName() + " have been turned off.");
  }

  

  




}