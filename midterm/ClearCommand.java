package midterm;
import mvc.*;

public class ClearCommand extends Command {
	
	  public ClearCommand(Model model){ 
		  super(model);
	  }
	  
	  public void execute() {
	     Etch etch = (Etch) model;
	     etch.clear();
	  }
}