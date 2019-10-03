package fisicasYgraficos;

public class Vector {
	public int modulo = 0;
	public double angle = 0;
	
	public Vector(int modulo, double angle) {
		super();
		this.modulo = modulo;
		this.angle = angle;
	}
	
	public int getModulo() {
		return modulo;
	}
	public void setModulo(int modulo) {
		this.modulo = modulo;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	

}
