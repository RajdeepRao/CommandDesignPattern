import java.util.*;
public class Controller{
;
  HashMap hm = new HashMap<Integer,Command>();
  int mode;

  Controller(){
    mode=0;
  }

  public void setCommand(int buttonNo, Command command){
    hm.put(buttonNo,command);
  }

  public void execute(int buttonNo){
    Command command1=(Command)hm.get(buttonNo);
    command1.execute();
  }

  public void setMode(int mode, int buttonNo){
    this.mode=mode;
    if(mode==1){
      Command command1=(Command)hm.get(buttonNo);
      command1.log();
    }
  }
}
