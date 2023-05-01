# Strategy Pattern

O padrão de projeto Strategy é um padrão comportamental que permite que você defina uma família de algoritmos, coloque cada um deles em uma classe separada e torne esses algoritmos intercambiáveis. O padrão Strategy permite que os algoritmos variem independentemente dos clientes que os utilizam.


Primeiro passo Crie a classe abstrata 

```

package br.com.stratagy;

public abstract class Strategy {

	public abstract void play();
}

```

Crie as classes que implementarão a classe abstrata, cada uma com uma implementação diferente do algoritimo:

```
public class EasyStratagy extends Strategy{

	@Override
	public void play() {
		System.out.println(Level.EASY.description);
	}

}


public class HardStrategy extends Strategy {

	@Override
	public void play() {
		System.out.println(Level.HARD.description);		
	}

}


public class MediumStrategy extends Strategy{

	@Override
	public void play() {
		System.out.println(Level.MEDIUM.description);			
	}

}

```

Enums utilizados
```
public enum Level {

	EASY("Play easy!!"),
	MEDIUM("Play medium!!"),
	HARD("Play hard!!");
	
	public String description;
	
	Level(String description) {
		this.description = description;
	}
}
```

Crie a classe de contexto:

```

public class Game {
	
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void play() {
		strategy.play();
	}
}


```

e Por fim crie um programa que instancie a classe de contexto e passe como argumento uma das implementaões da classe abstrata. Em seguida chame o método 'play()'.


```
public class App {

	public static void main(String[] args) {

		Game game = new Game();
		
		game.setStrategy(new HardStrategy());
		game.play();
	}

}
```


