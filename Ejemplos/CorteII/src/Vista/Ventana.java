package Vista;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import Modelo.Figura;
import Modelo.FiguraComposite;
import Modelo.FiguraFactory;

public class Ventana extends JFrame {
	
	public Ventana() {
        setTitle("Figuras Geométricas con Colores");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear figuras con colores personalizados
        List<Figura> figuras = new ArrayList<>();
        figuras.add(FiguraFactory.crearFigura("circulo", 10, 20, 60, Color.BLUE));
        figuras.add(FiguraFactory.crearFigura("cuadrado", 140, 30, 100, Color.RED));
        figuras.add(FiguraFactory.crearFigura("triangulo", 300, 30, 100, Color.GREEN));

        // Crear una figura compuesta con diferentes colores
        FiguraComposite compuesta = new FiguraComposite();
        compuesta.agregar(FiguraFactory.crearFigura("circulo", 10, 150, 60, Color.CYAN));
        compuesta.agregar(FiguraFactory.crearFigura("cuadrado", 140, 160, 100, Color.MAGENTA));
        figuras.add(compuesta);
        System.out.println(compuesta.getClass());
        System.out.println(figuras.getClass());

        // Agregar el lienzo con las figuras
        add(new Panel(figuras));
    }

}
