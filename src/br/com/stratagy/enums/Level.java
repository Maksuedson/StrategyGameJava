package br.com.stratagy.enums;

public enum Level {

	EASY("Play easy!!"),
	MEDIUM("Play medium!!"),
	HARD("Play hard!!");
	
	public String description;
	
	Level(String description) {
		this.description = description;
	}
}
