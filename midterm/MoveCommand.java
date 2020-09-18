package midterm;
import mvc.*;

public class MoveCommand extends Command{
	public MoveCommand(Model model) {
		super(model);
	}

	public void execute() {
		 Etch etch = (Etch) model;
		 etch.move();
	}
	

}
