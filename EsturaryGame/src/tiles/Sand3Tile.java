package tiles;

import java.awt.image.BufferedImage;

import gfx.Assets;

public class Sand3Tile extends Tile {

	public Sand3Tile(int id) {
		super(Assets.sand3, id);
	}

	// Methods
	@Override
	public boolean isSolid() {
		return true;
	}
}
