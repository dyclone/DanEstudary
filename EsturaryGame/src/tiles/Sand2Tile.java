package tiles;

import java.awt.image.BufferedImage;

import gfx.Assets;

public class Sand2Tile extends Tile {

	public Sand2Tile(int id) {
		super(Assets.sand2, id);
	}

	// Methods
	@Override
	public boolean isSolid() {
		return true;
	}
}
