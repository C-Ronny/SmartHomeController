/* Observer Design Pattern Implementation
 * ActionLog (Observer) Class
 * Uses observer pattern to track state of devices and stores and prints action logs
 */
import java.util.ArrayList;

public class ActionLog implements Observer{


  private ArrayList<String> logs;

  public ActionLog(){
    logs = new ArrayList<String>();
  }
  
  @Override
  public void update(String action){
    String log = "Action performed: " + action + " at " + System.currentTimeMillis();;
    logs.add(log);
    System.out.println(log);
  };


  public void displayLogs(){
    System.out.println("Action Logs:");
    if (logs.isEmpty()){
      System.out.println("No actions performed yet.");
    } 
    for (String log : logs) {
      System.out.println(log);
    }
  }
  
}
