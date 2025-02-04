package Controlador;

import javax.swing.SwingUtilities;

import Vista.Ventana;

public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> new Ventana().setVisible(true));

	}

}
