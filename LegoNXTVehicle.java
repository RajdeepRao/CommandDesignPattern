public class LegoNXTVehicle implements IRobot{

  LegoNXTVehicle(){

  }

  public void turnOn(){
    System.out.println("LegoNXTVehicle is On");
  }

  public void turnOff(){
    System.out.println("LegoNXTVehicle is Off");
  }

  public void setSpeed(int speed){
    System.out.println("LegoNXTVehicle is moving at a speed of: "+speed);
  }

  public void setAngle(int angle){
    System.out.println("LegoNXTVehicle has turned by" + angle+ "degrees");
  }

  public void setDistance(int distance){
    System.out.println("LegoNXTVehicle has moved by: "+distance);
  }
}
