import javax.swing.JOptionPane;

public class Menu {
	private String leyenda;
	
	public Menu(String leyenda) {
		this.leyenda = leyenda;
	}
	
	public String validarOpcionIngresada() {
		String valorIngresado = JOptionPane.showInputDialog(null,leyenda,"Ingreso de datos",3);
		boolean bandera = false;
		do {
			try {
				float valorNumerico = Float.parseFloat(valorIngresado);
				if(valorNumerico <= 0) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un numero mayor a 0", "Valor incorrecto", 0);
					valorIngresado = JOptionPane.showInputDialog(null,leyenda,"Ingreso de datos",3);
				}else {
					bandera = true;
				}
			}catch(NumberFormatException err) {
				if(valorIngresado == null) {
					break;
				}else {
					JOptionPane.showMessageDialog(null, err.getMessage() + " -> No ha ingresado un numero" , "Error en el ingreso de datos", 0);
					valorIngresado = JOptionPane.showInputDialog(null,leyenda,"Ingreso de datos",3);
				}
			}	
		}while(!bandera);
		
		return valorIngresado;
	}
	
}
