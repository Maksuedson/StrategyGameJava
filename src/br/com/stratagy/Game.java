package br.com.stratagy;

public class Game {
	
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void play() {
		strategy.play();
	}
}
