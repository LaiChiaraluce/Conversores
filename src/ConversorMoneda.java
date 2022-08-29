public class ConversorMoneda extends Conversor implements Convertir{
	
	private String[] monedas = {"De pesos a dolar", "De pesos a euro", "De pesos a libras esterlinas", "De pesos a yen japones", 
			"De pesos a won sul-coreano", "De dolar a pesos", "De euro a pesos", "De libras esterlinas a pesos",
			"De yen japones a pesos", "De won sul-coreano a pesos"};
	
	public ConversorMoneda(float valorCargado) {
		super(valorCargado);
	}
	
	public String[] getMonedas() {
		return monedas;
	}

	@Override
	public String convertir() {
		float tasaDolar = 137F;
		float tasaEuro = 136F;
		float tasaLibra = 161F;
		float tasaWon = 0.10F;
				
		switch(opcionElegida) {
			case "De pesos a dolar":
				msjReturn = this.redondear(this.valorCargado / tasaDolar) + " dolares"; 
				break;
			case "De pesos a euro":
				msjReturn = this.redondear(this.valorCargado / tasaEuro) + " euros"; 
				break;
			case "De pesos a libras esterlinas":
				msjReturn = this.redondear(this.valorCargado / tasaLibra) + " libras esterlinas"; 
				break;
			case "De pesos a yen japones":
				msjReturn = this.redondear(this.valorCargado) + " yens japoneses"; 
				break;
			case "De pesos a won sul-coreano":
				msjReturn = this.redondear(this.valorCargado * tasaWon) + " won sul-coreanos"; 
				break;
			case "De dolar a pesos":
				msjReturn = this.redondear(this.valorCargado * tasaDolar) + " pesos"; 
				break;
			case "De euro a pesos":
				msjReturn = this.redondear(this.valorCargado * tasaEuro) + " pesos"; 
				break;
			case "De libras esterlinas a pesos":
				msjReturn = this.redondear(this.valorCargado * tasaLibra) + " pesos"; 
				break;
			case "De won sul-coreano a pesos":
				msjReturn = this.redondear(this.valorCargado / tasaWon) + " pesos"; 
				break;
			case "De yen japones a pesos":
				msjReturn = this.redondear(this.valorCargado) + " pesos"; 
				break;
		}
		return msjReturn;
	}
}
