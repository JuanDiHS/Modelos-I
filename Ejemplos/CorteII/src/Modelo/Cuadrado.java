package Modelo;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado implements Figura {
	
	private int x, y, lado;
    private Color color;

    public Cuadrado(int x, int y, int lado) {
        this.x = x;
        this.y = y;
        this.lado = lado;
        this.color = Color.RED;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, lado, lado);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

}
