
public class ConversorTemperatura extends Conversor implements Convertir{
	
	private String[] sistemasTemp = {"De Celcius a Fahrenheit", "De Celcius a Kelvin", "De Fahrenheit a Celcius", "De Fahrenheit a Kelvin", 
			"De Kelvin a Celcius", "De Kelvin a Fahrenheit"};

	public ConversorTemperatura(float valorCargado) {
		super(valorCargado);
	}
	
	public String[] getSistemasTemp() {
		return sistemasTemp;
	}

	@Override
	public String convertir() {		
		switch(opcionElegida) {
			case "De Celcius a Fahrenheit":
				msjReturn = this.redondear(this.valorCargado * 1.8 + 32) + " grados Fahrenheit"; 
				break;
			case "De Celcius a Kelvin":
				msjReturn = this.redondear(this.valorCargado + 273.15) + " Kelvin"; 
				break;
			case "De Fahrenheit a Celcius":
				msjReturn = this.redondear((this.valorCargado - 32) / 1.8) + " grados Celcius"; 
				break;
			case "De Fahrenheit a Kelvin":
				msjReturn = this.redondear((this.valorCargado - 32) * 5/9 + 273.15) + " Kelvin"; 
				break;
			case "De Kelvin a Celcius":
				msjReturn = this.redondear(this.valorCargado - 273.15) + " grados Celcius"; 
				break;
			case "De Kelvin a Fahrenheit":
				msjReturn = this.redondear(1.8 * (this.valorCargado - 273.15) + 32) + " grados Fahrenheit"; 
				break;
		}
		return msjReturn;
	}
}
