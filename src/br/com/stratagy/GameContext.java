package br.com.stratagy;

public class GameContext {
	
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void play() {
		strategy.play();
	}
}
