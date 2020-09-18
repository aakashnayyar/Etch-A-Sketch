package midterm;
import mvc.*;
import java.awt.Color;
import java.util.ArrayList;

public class Etch extends Model {
	public static Integer WORLD_SIZE = 250; // height & width of the world (& view)
	// diameter of a turtle
	//public static Integer CRUMB_SIZE = 5;   // diameter of a point drawn by the turtle

	private Color color;
	private Point point;
	private Heading direction;
	private ArrayList<Point> path;
	private Point newPoint;
	//private boolean penDown;
	
	public Etch() {
		point = new Point(125, 125, Color.BLACK);
		newPoint = new Point(125, 125, Color.BLACK);
		path = new ArrayList<>();
		path.add(point);
		direction = Heading.N;
	}
	
	public void turn(Heading updatedDirection) {
		direction = updatedDirection; //set direction
		changed();
	}
	
	
	public void move() {
		if(direction == Heading.N) {
			newPoint = new Point(point.getX(), point.getY()-50, point.color);
		}
		else if(direction == Heading.W) {
			newPoint = new Point(point.getX()-50,point.getY(), point.color);
		}
		else if(direction == Heading.S) {
			newPoint = new Point(point.getX(), point.getY()+50, point.color);
		}
		else if(direction == Heading.E) {
			newPoint = new Point(point.getX()+50, point.getY(), point.color);
		}
		path.add(newPoint);
		point = newPoint;
		changed();
		
		
		
	}
	
	public void clear() {
		path.clear();
		point = new Point(125, 125, Color.BLACK);
		path.add(point);
		changed();
	}

	
	public void setColor(Color color) {
		this.color = color;
		changed();
	}
	
	public Color getColor() {
		return color;
	}
	

	public ArrayList<Point> getPath() {
		return path;
	}

	public Point getPoint() {
		return point;
	}
	
	public Point getnewPoint() {
		return newPoint;
	}
	
	public void setPoint(Point p) {
		point = p;
	}
	
	public Heading getDirection() {
		return direction;
	}


	
}
