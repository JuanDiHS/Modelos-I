import java.util.List;
public class Estudiante {
	 private String nombre;
	    private List<Integer> calificaciones;
	    private Curso curso;

	    public Estudiante(String nombre, List<Integer> calificaciones, Curso curso) {
	        this.nombre = nombre;
	        this.calificaciones = calificaciones;
	        this.curso = curso;
	    }

	    public void mostrarInfo() {
	        String calificacionesStr = calificaciones.toString();
	        System.out.println("Estudiante: " + nombre + ", Calificaciones: " + calificacionesStr + ", " + curso.mostrarInfo());
	    }
}
