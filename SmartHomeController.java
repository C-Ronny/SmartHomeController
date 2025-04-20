public class SmartHomeController{

  public static void main (String[] args){

    Controller controller = Controller.getInstance();

    // Create a new room
    Room livingRoom = new Room("Living Room");

    // Add a room to the controller
    controller.addRoom(livingRoom);

    // Create a new light device
    Light light = new Light("LED");

    livingRoom.addDevice(light);

    // Test individual device control
    System.out.println("\nTesting individual device control:");
    light.turnOn();
    light.turnOff();

    // Test room-level control
    System.out.println("\nTesting room-level control:");
    livingRoom.turnOnAll();
    livingRoom.turnOffAll();

    // Test controller
    System.out.println("\nTesting controller:");
    controller.addRoom(livingRoom);
    controller.controlDevice(light, true);  // Turn on
    controller.controlDevice(light, false); // Turn off

  }

}