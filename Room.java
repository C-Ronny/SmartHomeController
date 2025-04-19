import java.util.ArrayList;

public class Room{

  // Instance Variables
  private String name;
  ArrayList<Device> devices = new ArrayList<Device>();
  public int deviceCount = 0;

  // Constructor
  public Room(String name){
    this.name = name;
  }

  // Accessor methods

  // Return the list of devices.
  public void getDevices(){
    System.out.println("Devices:"); 
    for (int i=0; i<devices.size(); i++){
      System.out.println(devices.get(i).getName());
    }
  }

  // Return the room’s name.
  public String getName(){
    return this.name;
  }


  // Mutator methods

  public void setName(String name){
    this.name = name;
  }


  
  // Class Method Definitions


  // Add a device to the room.
  public void addDevice(String name){
    devices.add(new Device(name));
    deviceCount++;
    System.out.println("New Device Successfully added to the room.");
    getDevices();
  } 
  
  // Turn on all devices in the room.
  public void turnOnAll(){
    for(int i=0; i<deviceCount; i++){
      devices.get(i).turnOn();
    }
    System.out.println("All devices in the room have been turned on.");
  }

  //  Turn off all devices in the room.
  public void turnOffAll(){
    for(int i=0;i<deviceCount;i++){
      devices.get(i).turnOff();
    }
    System.out.println("All devices in the room have been turned off.");
  }

  

  




}