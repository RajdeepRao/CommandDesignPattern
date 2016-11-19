import java.io.*;
public class TurnOff implements Command {

	IRobot bot;

	public TurnOff(IRobot bot){
		this.bot = bot;
	}

	public void execute() {
		bot.turnOff();
	}

	public void log(){
		try{
			FileWriter out = new FileWriter("log.txt",true);
			out.write("Turnig bot off");
			out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
