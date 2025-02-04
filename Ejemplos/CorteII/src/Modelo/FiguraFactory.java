package Modelo;

import java.awt.Color;

public class FiguraFactory {
	
	  public static Figura crearFigura(String tipo, int x, int y, int size, Color color) {
	        Figura figura = null;
	        switch (tipo.toLowerCase()) {
	            case "circulo":
	                figura = new Circulo(x, y, size);
	                break;
	            case "cuadrado":
	                figura = new Cuadrado(x, y, size);
	                break;
	            case "triangulo":
	                figura = new Triangulo(x, y, size, size);
	                break;
	        }
	        if (figura != null) {
	            figura.setColor(color);
	        }
	        return figura;
	    }

}
