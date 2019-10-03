package fisicasYgraficos;

import java.awt.Point;

public abstract class Objeto {
	double masa = 1;
	Point coordenadas;
	Vector aceleracion;
	Vector velocidad;
	
	abstract void dibujar();
	
}
