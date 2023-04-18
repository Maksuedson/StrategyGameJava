package br.com.stratagy;

import br.com.stratagy.game.HardStrategy;

public class App {

	public static void main(String[] args) {

		Game game = new Game();
		
		game.setStrategy(new HardStrategy());
		game.play();
	}

}
