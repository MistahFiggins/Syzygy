package buttons;

import java.awt.Rectangle;

public class ScreenButton extends Button {
	
	//// Fields
	
	private Rectangle box;
	
	//// Constructors
	
	public ScreenButton(String name, Rectangle box) {
		this.name = name;
		this.box = box;
	}
	
	//// Methods
	
	@Override
	public boolean update() {
		// TODO: Figure out how to get input in here
	}
	
	/**
	 * Displays the Button on the screen to be pressed
	 */
	public void display() {
		// TODO: write this or figure out where this code should go
	}
	
}