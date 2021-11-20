package Combustible;
import javax.swing.*;

public class Mensajes {
	
	int opcion=0;
	
	public Mensajes() {
			
	}
	
	public int menu() {
		
		Icon imagen= new ImageIcon(getClass().getResource("/recursos/logo.png"));
		JOptionPane.showMessageDialog(null, "1.Nuevo consumo\n2.Ver consumo vehiculos\n3.Consumo total\n4.Salir","Administracion de combustible",JOptionPane.QUESTION_MESSAGE,imagen);
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion a seleccionar"));
		return opcion;
	}
	
	public int vehiculos1() {
		
		Icon imagen= new ImageIcon(getClass().getResource("/recursos/edicion.png"));
		JOptionPane.showMessageDialog(null, "1.Coche\n2.Camion\n3.Trailer\n4.Regresar","Registro de vehiculos",JOptionPane.QUESTION_MESSAGE,imagen);
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion a seleccionar"));
		return opcion;
	}
	
	public int vehiculos2() {
		
		Icon imagen= new ImageIcon(getClass().getResource("/recursos/evaluacion.png"));
		JOptionPane.showMessageDialog(null, "1.Coche\n2.Camion\n3.Trailer\n4.Regresar","Evaluacion de vehiculos",JOptionPane.QUESTION_MESSAGE,imagen);
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion a seleccionar"));
		return opcion;
	}
}
