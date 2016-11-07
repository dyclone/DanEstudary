package EstuaryGame;

import gfx.GameCamera;
import input.KeyManager;
import worlds.World;

//This class is going to allow us to just pass one object( a handler object) and allow us to access our game object our world object, and any other thing that we need
public class Handler {

	//Attributes
	private Game game;
	private World world;
	
	//Constructor 
	public Handler(Game game){
		this.game = game;
	}

	//Getter and Setter
	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
	
}
