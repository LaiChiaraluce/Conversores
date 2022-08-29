import javax.swing.*;

public class Aplicacion {
	
	public static void main(String[] args) {
		boolean banderaMenu = false;
		do {
			String opcion = menu();
			try {
				banderaMenu = switchearOpciones(opcion, banderaMenu);
			}catch(NullPointerException error) {
				JOptionPane.showMessageDialog(null, "Programa terminado", "Cierre de programa", 1);
				banderaMenu = true;
			}
			
		}while(!banderaMenu);
	}
	
	public static String menu() {
		String[] conversores = {"Conversor de moneda - Moneda Argentina", "Conversor de temperatura"};
		try {
			String valorOpciones = JOptionPane.showInputDialog(null, "Elija el conversor a utilizar", "Menu de Conversores", -1, null, conversores, null).toString();
			return valorOpciones;
		}catch(NullPointerException error) {
			return null;
		}
	}
	
	public static boolean switchearOpciones(String opcion, boolean banderaMen) {
		switch(opcion) {
			case "Conversor de moneda - Moneda Argentina":{
				Menu menuMoneda = new Menu("Ingrese la cantidad de dinero que desea convertir");
				String valorMonto = menuMoneda.validarOpcionIngresada();
				
				if(valorMonto != null) {

					ConversorMoneda conversor = new ConversorMoneda(Float.parseFloat(valorMonto));
					String valorMoneda = JOptionPane.showInputDialog(null, "Elija la moneda a convertir", "Tipo de cambio", -1, null, conversor.getMonedas(), null).toString();
					conversor.setOpcionElegida(valorMoneda);
					JOptionPane.showMessageDialog(null, "Usted posee: " + conversor.convertir(), "Resultado de la conversión", 1);
						
					banderaMen = switchearConfirm(banderaMen);
				}
				break;
			}
			case "Conversor de temperatura":{
				Menu menuTemperatura = new Menu("Ingrese los grados de temperatura que desea convertir");
				String valorTemperatura = menuTemperatura.validarOpcionIngresada();
				
				if(valorTemperatura != null) {

					ConversorTemperatura conversor = new ConversorTemperatura(Float.parseFloat(valorTemperatura));
					String valorGrados = JOptionPane.showInputDialog(null, "Elija el sistema de temperatura para el pasaje", "Sistemas de medición de temperatura", -1, null, conversor.getSistemasTemp(), null).toString();
					conversor.setOpcionElegida(valorGrados);
					JOptionPane.showMessageDialog(null, "Temperatura obtenida: " + conversor.convertir(), "Resultado de la conversión", 1);
						
					banderaMen = switchearConfirm(banderaMen);
				}
				break;
			}
			
		}
		return banderaMen;
	}
	
	public static boolean switchearConfirm(boolean banderaMen) {
		int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Escoja una opción", 1);
		
		switch(confirm) {
			case 0:
				banderaMen = false;
				break;
			case 1, 2:
				JOptionPane.showMessageDialog(null, "Programa terminado", "Cierre de programa", 1);
				banderaMen = true;
				break;
		}
		return banderaMen;
	}
	
}
