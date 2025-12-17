package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	// Instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	//methods:
	
	//precondition: None
	//postcondition: moves paddle's x value by its velocity
	public void move() {
		x += velocity;
	}

	//precondition: g is a non-null value
	//postcondition: draws the paddle on the screen
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}

	//precondition: dv is non-null
	//postcondition: changes the paddle's velocity for dv
	public void addVelocity(int dv) {
		velocity = dv;
	}

	//precondition: x is a non-null number
	//postcondition: sets the paddle's x value equal to the inputed x
	public void setX(int x) {
		this.x = x;
	}


	//precondition: None
    //postcondition: returns the paddle's x value
	public int getX() {
		return x;
	}

	//precondition: None
    //postcondition: returns the paddle's y value
	public int getY() {
		return y;
	}

	//precondition: None
    //postcondition: returns the paddle's width value
	public int getWidth() {
		return width;
	}

	//precondition: None
    //postcondition: returns the paddle's height value
	public int getHeight() {
		return height;
	}

	//precondition: None
    //postcondition: returns the paddle's velocity value
	public int getVelocity() {
		return velocity;
	}
	
	public void setVelocity(int speed) {
		velocity = speed;
	}
}
