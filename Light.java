public class Light implements Device{

  private String name;
  private boolean isOn;
  
  public Light(String name){
    this.name = name;
    this.isOn = false;
  }
  // Accessor methods
  @Override
  public String getName(){
    return this.name;
  }

  // Turn of the light
  @Override
  public void turnOff(){
    if (isOn){
      isOn = false;
      System.out.println(this.name + " has been turned off.");
    } else {
      System.out.println(this.name + " is already off.");
    }
  }

  // Turn on the light
  @Override
  public void turnOn(){
    if (!isOn){
      isOn = true;
      System.out.println(this.name + " has been turned on.");
    } else {
      System.out.println(this.name + " is already on.");
    }
  }

  // Check if the light is on
  @Override
  public boolean isOn(){
    return isOn;    
  }


}