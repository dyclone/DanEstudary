package worlds;

import java.awt.Graphics;

import EstuaryGame.Game;
import EstuaryGame.Handler;
import tiles.Tile;
import utils.Utils;

public class World {
	
	//Attributes
	private Handler handler;
	private int width, height; 
	private int spawnX, spawnY;
	private int[][] tiles;
	
	//Constructor
	public World(Handler handler, String path){
		this.handler = handler;
		loadWorld(path);
	}
	
	//Methods
	public void tick(){
		
	}
	
	public void render(Graphics g){
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH );
		int xEnd = (int)Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEWIDTH);
		int yEnd = (int)Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for (int y = yStart; y < yEnd; y++){
			for(int x = xStart; x < xEnd; x++){
				getTile(x, y).render(g, (int)(x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int)(y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
	}
	
	//get tile from tiles two dimension array checks 1 dimensional array in tile class to find index
	public Tile getTile(int x, int y){
		if(x < 0 || y < 0 || x >= width || y >= height){
			return Tile.waterTile;
		}
		
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null){
			return Tile.skyTile;
		}
		return t;
	}
	//responsible for loading in world
	private void loadWorld(String path){
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y < height; y ++){
			for(int x = 0; x < width; x++){
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}


}
