package factoryPrimer;

public interface Figura {

	void crtaj();
}

// Figura.java
public class Pravougaonik implements Figura {
	// Pravougaonik.java
	@Override
	public void crtaj() {
		System.out.println("Unutar Pravougaonik::crtaj() metode!");
	}
}

public class Kvadrat implements Figura {
	// Kvadrat.java
	@Override
	public void crtaj() {
		System.out.println("Unutar Kvadrat::crtaj() metode!");
	}
}

public class Krug implements Figura {
	// Krug.java
	@Override
	public void crtaj() {
		System.out.println("Unutar Krug::crtaj() metode!");
	}
}
