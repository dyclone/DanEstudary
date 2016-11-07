package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {

	//Static stuff here
	public static Tile[] tiles = new Tile[256];
	public static Tile sandTile = new SandTile(0);
	public static Tile waterTile = new WaterTile(1);
	public static Tile skyTile = new SkyTile(2);
	
	public static Tile sand2Tile = new Sand2Tile(3);
	public static Tile sand3Tile = new Sand3Tile(4);
	public static Tile sand4Tile = new Sand4Tile(5);
	
	public static Tile water2Tile = new Water2Tile(6);
	public static Tile water3Tile = new Water3Tile(7);
	
	public static Tile sky2Tile = new Sky2Tile(8);
	public static Tile sky3Tile = new Sky3Tile(9);
	public static Tile sky4Tile = new Sky4Tile(10);
	
	public static Tile cliffTile = new CliffTile(11);
	public static Tile cliff2Tile = new Cliff2Tile(12);
	public static Tile cliffSkyTile = new CliffSkyTile(13);
	public static Tile cliffSky2Tile = new CliffSky2Tile(14);
	
//Class 
	//Attributes
	protected BufferedImage texture;
	protected final int id;
	
	//Variables 
	public static final int TILEWIDTH = 32, TILEHEIGHT = 32;
	
	//Constructor 
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		tiles[id] = this;
	}
	
	//Methods 
	public void tick(){
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public int getId(){
		return id;
	}
}
