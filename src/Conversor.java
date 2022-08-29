
public abstract class Conversor {
	protected float valorCargado;
	protected String opcionElegida;
	protected String msjReturn;
	
	public Conversor(float valorCargado) {
		this.valorCargado = valorCargado;
	}
	
	public double redondear(double operacion) {
		return Math.round(operacion*100.0)/100.0;
	}
	
	public void setOpcionElegida(String opcionElegida) {
		this.opcionElegida = opcionElegida;
	}
	
}
