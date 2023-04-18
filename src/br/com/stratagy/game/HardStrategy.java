package br.com.stratagy.game;

import br.com.stratagy.Strategy;
import br.com.stratagy.enums.Level;

public class HardStrategy extends Strategy {

	@Override
	public void play() {
		System.out.println(Level.HARD.description);		
	}

}
