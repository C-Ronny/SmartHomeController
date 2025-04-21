/*
 * Light (subject) class
 * Implements the Device interface and Observable interface
 * Represents a light device that can be turned on or off
 * and notifies observers of its state changes  
 */

import java.util.ArrayList;

public class Light implements Device, Observable{

  private String name;
  private boolean isOn;
  private ArrayList<Observer> observers;
  
  public Light(String name){
    this.name = name;
    this.isOn = false;
    this.observers = new ArrayList<Observer>();
  }

  // Accessor methods
  @Override
  public String getName(){
    return this.name;
  }
  // Check if the light is on
  @Override
  public boolean isOn(){
    return isOn;    
  }


  /* 
  *Class Method definitions
  */ 

  

  // Turn on the light
  @Override
  public void turnOn(){
    if (!isOn){
      isOn = true;
      System.out.println(this.name + " has been turned on.");
      notifyObservers(this.name + " is on");
    } else {
      System.out.println(this.name + " is already on.");
    }
  }

  // Turn off the light
  @Override
  public void turnOff(){
    if (isOn){
      isOn = false;
      System.out.println(this.name + " has been turned off.");
      notifyObservers(this.name + " is off");
    } else {
      System.out.println(this.name + " is already off.");
    }
  }

  // Observable methods
  public void addObserver(Observer observer){
    observers.add(observer);
  }
  public void removeObserver(Observer observer){
    observers.remove(observer);
  }
  public void notifyObservers(String action){
    for (Observer observer : observers){
      observer.update(action);
    }
  }




}