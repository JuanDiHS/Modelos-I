package Modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class FiguraComposite implements Figura{
	
	 private List<Figura> figuras = new ArrayList<>();

	    public void agregar(Figura figura) {
	        figuras.add(figura);
	    }

	    @Override
	    public void dibujar(Graphics g) {
	        for (Figura figura : figuras) {
	            figura.dibujar(g);
	        }
	    }

	    @Override
	    public void setColor(Color color) {
	        for (Figura figura : figuras) {
	            figura.setColor(color);
	        }
	    }

}
