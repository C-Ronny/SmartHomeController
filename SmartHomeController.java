public class SmartHomeController{


  public static void main (String[] args){
    
    // Create a room
    Room room = new Room("Living Room");

    // Create and add a light
    Device Light = new Light("LED Light");
    room.addDevice(Light);

    // Test individaul device control
    Light.turnOff();
    Light.turnOn();
    Light.turnOff();

    // Test-room level control
  
  }

}