public class Light extends Device{

  private String name;
  private boolean isOn;
  
  public Light(String name){
    this.name = name;
  }


  public void turnOff(){
    if (isOn == true){
      isOn = false;
      System.out.println(this.name + " light has been turned off.");
    } else {
      System.out.println(this.name + "light is already off.");
    }
  }

  public void turnOn(){
    if (isOn == false){
      isOn = true;
      System.out.println(this.name + " light has been turned on.");
    } else {
      System.out.println(this.name + "light is already on.");
    }
  }


  public boolean isOn(){
    if (isOn == true){
      return true;
    } else {
      return false;
    }
  }


}