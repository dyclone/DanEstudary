package states;

import java.awt.Graphics;

import EstuaryGame.Game;
import EstuaryGame.Handler;

public abstract class State {
	
	//Attributes
	private static State currentState = null;
	
	
	
	//Setter
	public static void setState(State state){
		currentState = state;
	}
	
	//Getter
	public static State getState(){
		return currentState;
	}
	
	
	
	//Class
	
	protected Handler handler;
	
	public State(Handler handler){
		this.handler = handler;
	}
	//Methods that every state will need
	public abstract void tick();
	
	public abstract void render(Graphics g);
}
