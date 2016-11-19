import java.io.*;
public class TurnOn implements Command {

	IRobot bot;

	public TurnOn(IRobot bot){
		this.bot= bot;
	}

	public void execute() {
		bot.turnOn();
	}

	public void log(){
		try{
			FileWriter out = new FileWriter("log.txt",true);
			out.write("Turnig bot on");
			out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}


	}
}
