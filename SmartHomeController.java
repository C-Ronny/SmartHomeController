public class SmartHomeController{


  public static void main (String[] args){
    Room room = new Room("Home");  
    
    room.addDevice("Light");
    System.out.println("");
    room.addDevice("Fan");
    System.out.println("");
    room.addDevice("TV");
    System.out.println("");
  
  
  }

}