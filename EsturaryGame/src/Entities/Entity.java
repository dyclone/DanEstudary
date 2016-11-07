package Entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import EstuaryGame.Game;
import EstuaryGame.Handler;

public abstract class Entity {

	//Attributes
	protected float x, y;
	protected int width, height;
	protected Handler handler; 
	protected Rectangle bounds;
	//Constructor 
	public Entity(Handler handler, float x, float y, int width, int height){
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		bounds = new Rectangle(0, 0, width, height);
	}
	
	//Getter and Setters
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	//Methods 
	public abstract void tick();
	
	public abstract void render(Graphics g);
}
