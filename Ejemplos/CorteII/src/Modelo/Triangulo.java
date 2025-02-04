package Modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangulo implements Figura {
	 private int x, y, base, altura;
	    private Color color;

	    public Triangulo(int x, int y, int base, int altura) {
	        this.x = x;
	        this.y = y;
	        this.base = base;
	        this.altura = altura;
	        this.color = Color.GREEN;
	    }

	    @Override
	    public void dibujar(Graphics g) {
	        int[] xPoints = { x, x - base / 2, x + base / 2 };
	        int[] yPoints = { y, y + altura, y + altura };
	        g.setColor(color);
	        g.fillPolygon(new Polygon(xPoints, yPoints, 3));
	    }

	    @Override
	    public void setColor(Color color) {
	        this.color = color;
	    }

}
