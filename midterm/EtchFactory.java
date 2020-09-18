package midterm;

import mvc.*;

public class EtchFactory implements AppFactory {

	public Model makeModel() { return new Etch(); }

	public String[] getEditCommands() { 
		return new String[] {"Turn","Move","Clear"}; 
	}

	public Command makeEditCommand(Model model, String type) {
		if(type == "Turn")
			return new TurnCommand(model);
		else if(type == "Move")
			return new MoveCommand(model);
		else if(type == "Clear")
			return new ClearCommand(model);
		return null;
	}
	
	public String getTitle() {
		return "Etch-A-Sketch Simulator";
	}

	public String[] getHelp() {
		return new String[] {"Use turn to turn.",
				"Use Move to draw a line.",
				"Use clear to clear the path."};
	}

	public String about() {
		return "Etch-A-Sketch Simulator version 1.0. Copyright 2020 by NayyarDesigns";
	}


}