/*
 * 
 * Observable interface
 * Defines the methods a subject must implement to manage and notify its observers
 */



public interface Observable {
  
  // Method to add an observer
  public void addObserver(Observer observer);

  // Method to remove an observer
  public void removeObserver(Observer observer);

  // Method to notify all observers of a change
  public void notifyObservers(String action);

}
