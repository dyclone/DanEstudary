package states;

import java.awt.Graphics;

import Entities.creatures.Player;
import EstuaryGame.Game;
import EstuaryGame.Handler;
import gfx.Assets;
import tiles.Tile;
import worlds.World;

public class GameState extends State{

	//Attributes
	private Player player;
	private World world;
	
	//Constructor
	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100, 150);
	}
	
	//Methods
	@Override
	public void tick() {
		world.tick();
		player.tick();

	}
	
	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
