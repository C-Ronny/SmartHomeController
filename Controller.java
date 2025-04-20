import java.util.ArrayList;

public class Controller{

  // Private static instance for Singleton implementation
  private static Controller instance = null;
  // List to store rooms in controller
  private ArrayList<Room> rooms;

  // Private constructor to prevent instantiation
  private Controller(){
    rooms = new ArrayList<>();
  }

  // Thread-safe public method to access the single instance 
  public static synchronized Controller getInstance(){
    if (instance == null){
      instance = new Controller();
    } 
    return instance; 
  }

  // Get the list of rooms in the controller
  public void getRooms(){
    System.out.println("Rooms:");
    for(Room Room: rooms){
      System.out.println(Room.getName());
    }
  }

  // Add a room to the controller
  public void addRoom(Room newRoom){    
    rooms.add(newRoom);
    System.out.println(newRoom.getName() + " successfully added to the controller.");

  }
  
  // Control a specific device (turn on or off)
  public void controlDevice(Device device, boolean turnOn){
    if (turnOn) {
      device.turnOn();
    } else {
      device.turnOff();
    }
    System.out.println(device.getName() + " : " + (turnOn ? "On" : "Off"));

  }
}