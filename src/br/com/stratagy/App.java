package br.com.stratagy;

import br.com.stratagy.game.HardStrategy;

public class App {

	public static void main(String[] args) {

		GameContext game = new GameContext();
		
		game.setStrategy(new HardStrategy());
		game.play();
	}

}
