package midterm;

import java.awt.*;
import javax.swing.*;
import mvc.*;

public class EtchPanel extends AppPanel {
	private JButton turn;
	private JButton move;
	private JButton clear;
	
	public EtchPanel(AppFactory factory) {
		super(factory);
		EtchView view = new EtchView((Etch)model);
		this.setLayout(new GridLayout(1, 2));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3,1));
		turn = new JButton("Turn");
		turn.addActionListener(this);
		JPanel turnPanel = new JPanel();
		turnPanel.add(turn);
		buttonPanel.add(turnPanel);
		
		move = new JButton("Move");
		move.addActionListener(this);
		JPanel movePanel = new JPanel();
		movePanel.add(move);
		buttonPanel.add(movePanel);
		
		clear = new JButton("Clear");
		clear.addActionListener(this);
		JPanel clearPanel = new JPanel();
		clearPanel.add(clear);
		buttonPanel.add(clearPanel);
		add(buttonPanel);
		add(view);
		
	
	}

	public static void main(String[] args) {
		AppFactory factory = new EtchFactory();
		AppPanel panel = new EtchPanel(factory);
		panel.display();
	}

}
