package gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	//Variables
	private static final int width = 32, height = 32;
	
	//Attributes
	public static BufferedImage player, sand, water, sky, sand2, sand3, sand4, water2, water3, sky2, sky3, sky4, cliff, cliff2, cliffSky, cliffSky2;
	
	//loads in everything for our game
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Tiles.png"));
		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/crab.png"));
		player = sheet2.crop(0, 0, 96, 85);
		sand = sheet.crop(0, 0, width, height);
		sand2 = sheet.crop(0, height, width, height);
		sand3 = sheet.crop(0, height * 2, width, height);
		sand4 = sheet.crop(0, height * 3, width, height);

		water = sheet.crop(width, 0, width, height);
		water2 = sheet.crop(width, height, width, height);
		water3 = sheet.crop(width, height * 2, width, height);

		
		sky = sheet.crop(width*3, 0, width, height);
		sky2 = sheet.crop(width*3, height, width, height);
		sky3 = sheet.crop(width*3, height * 2, width, height);
		sky4 = sheet.crop(width*3, height * 3, width, height);
		
		cliff = sheet.crop(width*2, height * 2, width, height);
		cliff2 = sheet.crop(width*2, height * 3, width, height);
		cliffSky = sheet.crop(width*2, 0, width, height);
		cliffSky2 = sheet.crop(width*2, height, width, height);

	}
}
