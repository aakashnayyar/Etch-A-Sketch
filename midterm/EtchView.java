package midterm;
import java.util.*;

import mvc.*;
import java.awt.Color;
import java.awt.*;

public class EtchView extends View{

	public EtchView(Etch etch) {
		super(etch);
	}
	
	
	public void paintComponent(Graphics gc) {
		Etch etch = (Etch) model;
		gc.setColor(Color.BLACK);
		
		gc.fillOval(etch.getPoint().getX(), etch.getPoint().getY(), 5, 5);
		
		//gc.drawLine(etch.getPoint().getX(), etch.getPoint().getY(), etch.getnewPoint().getX(), etch.getnewPoint().getY());
		
		ArrayList<Point> path = etch.getPath();
		
		for(int i=1; i< path.size(); i++) {
			gc.drawLine(path.get(i-1).getX(), path.get(i-1).getY(), path.get(i).getX(), path.get(i).getY());
		}
	}
	
	

}
