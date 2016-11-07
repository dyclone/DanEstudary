package EstuaryGame;

import display.Display;

//only thing this class does it start up our game
public class Launcher {

	public static void main(String[] args){
		Game game = new Game("Title!", 400, 400);
		game.start();
	}
}
