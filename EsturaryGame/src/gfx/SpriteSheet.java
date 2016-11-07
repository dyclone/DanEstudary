package gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	//Attributes
	private BufferedImage sheet;
	
	//Constructor
	public SpriteSheet(BufferedImage sheet){
		this.sheet = sheet;
	}
	
	//method to get sub-images
	public BufferedImage crop(int x, int y, int width, int height){
		return sheet.getSubimage(x, y, width, height);
	}
}
