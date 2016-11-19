import java.io.*;
public class implementation{

  public static void main(String[] args){

    IRobot bot=new LegoNXTVehicle();
    Controller ctrl=new Controller();

    TurnOn switchOn=new TurnOn(bot);
    TurnOff switchOff=new TurnOff(bot);

    ctrl.setCommand(1,switchOn);
    ctrl.setCommand(2,switchOff);

    ctrl.execute(1);
    ctrl.execute(2);

    ctrl.setMode(1,1);
    ctrl.setMode(1,2);



  }

}
