package tiles;

import gfx.Assets;

public class SandTile extends Tile {

	public SandTile(int id) {
		super(Assets.sand, id);
	}

	// Methods
	@Override
	public boolean isSolid() {
		return true;
	}
}
