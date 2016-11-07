package tiles;

import java.awt.image.BufferedImage;

import gfx.Assets;

public class Sand4Tile extends Tile {

	public Sand4Tile(int id) {
		super(Assets.sand4, id);
	}

	// Methods
	@Override
	public boolean isSolid() {
		return true;
	}
}
