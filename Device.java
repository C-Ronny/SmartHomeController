// Device Interface for all types of devices
public interface Device {
  public void turnOn();
  public void turnOff();
  public boolean isOn();
  public String getName();
}