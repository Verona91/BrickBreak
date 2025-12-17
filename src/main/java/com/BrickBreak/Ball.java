// Verona María Gerolmini Bianchimano

// breif description of the class


package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int velocityX;
	private int velocityY;
	
	
	//constructor(s):
	public Ball(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	//methods:

	//precondition: g is a non-null value
	//postcondition: makes the ball on the screen
	public void draw(Graphics g) {
		g.setColor(Color.cyan);
		g.fillOval(x, y, radius, radius);
	}

	//precondition: None
	//postcondition: moves the ball by velocityX and velocityY
	public void move() {
		x += velocityX;
		y += velocityY;
	}

    //precondition: none
    //postcondition: changes the x direction of the ball
	public void reverseX() {
		velocityX *= -1;
	}

	//precondition: None
	//postcondition: changes the y direction of the ball
	public void reverseY() {
		velocityY *= -1;
	}

	//precondition: None
    //postcondition: returns the ball's x value
	public int getXpos() {
		return x;
	}

	//precondition: None
    //postcondition: returns the ball's y value
	public int getYpos() {
		return y;
	}

	//precondition: None
    //postcondition: returns the ball's radius value
	public int getSize() {
		return radius;
	}

	//precondition: x is a non-null number
	//postcondition: sets the x value of the ball equal to the inputed x
	public void setX(int x) {
		this.x = x;
	}

	//precondition: y is a non-null number
	//postcondition: sets the y value of the ball equal to the inputed y
	public void setY(int y) {
		this.y = y;
	}

	//precondition: x is a non-null number, and when increasing or decreasing the velocityX don't change by a whole number.
	//postcondition: sets the velocityX of the ball equal to the inputed x
	public void setXVelocity(int x) {
		velocityX = x;
	}

	//precondition: y is a non-null number, and when increasing or decreasing the velocityY don't change by a whole number.
	//postcondition: sets the velocityY of the ball equal to the inputed y
	public void setYVelocity(int y) {
		velocityY = y;
	}
}
