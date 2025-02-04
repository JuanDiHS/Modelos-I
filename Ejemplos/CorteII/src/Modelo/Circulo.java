package Modelo;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo implements Figura {
	
	private int x, y, radio;
    private Color color;

    public Circulo(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.color = Color.BLUE; // Color por defecto
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radio * 2, radio * 2);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
	

}
