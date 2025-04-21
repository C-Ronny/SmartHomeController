/*
 * Observer class to be implemented by classes that want to be notified of changes and be able to receive updates from a subject
 * 
 */



public interface Observer {

  public void update(String action);

}
