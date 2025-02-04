package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import Modelo.Figura;
import Modelo.FiguraComposite;

public class Panel extends JPanel {
	
	 private List<Figura> figuras;

	    public Panel(List<Figura> figuras) {
	        this.figuras = figuras;
	    }
	    

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        for (Figura figura : figuras) {
	            figura.dibujar(g);
	        }
	    }

}
